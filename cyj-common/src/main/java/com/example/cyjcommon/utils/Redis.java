package com.example.cyjcommon.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.SortParameters;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.query.SortQuery;
import org.springframework.data.redis.core.query.SortQueryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@Component
public class Redis {

    private static final Logger logger = LoggerFactory.getLogger(Redis.class);

    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public static Redis companyExecute;

    /**
     * 初始化当前类
     */
    @PostConstruct
    public void init() {
        companyExecute = this;
        Set<String> keys = companyExecute.redisTemplate.keys("*");
        redisTemplate.delete(keys);
    }


    /**
     * 根据redis Key获取该列表，并进行按照keyPattern的降序排列，并重新放入到该key当中
     *
     * @param key        redis键
     * @param keyPattern 要排序的字段
     */
    public void sortKeyByPatternStoreKey(String key, String keyPattern) {
        SortQuery<String> query = SortQueryBuilder.sort(key).by(keyPattern).order(SortParameters.Order.ASC).build();
        companyExecute.redisTemplate.sort(query, key);
    }

    /**
     * 修改redis键
     *
     * @param oldKey 旧键
     * @param newKey 新键
     * @return Boolean
     */
    public Boolean renameKey(String oldKey, String newKey) {
        try {
            companyExecute.redisTemplate.rename(oldKey, newKey);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * 指定缓存失效时间
     *
     * @param key  键
     * @param time 时间(秒)
     */
    public void expire(String key, long time) {
        try {
            if (time > 0) {
                companyExecute.redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }


    /**
     * 根据key 获取过期时间
     *
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public long getExpire(String key) {
        return companyExecute.redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }


    /**
     * 判断key是否存在
     *
     * @param key 键
     * @return true 存在 false不存在
     */
    public boolean hasKey(String key) {
        try {
            return companyExecute.redisTemplate.hasKey(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 删除缓存
     *
     * @param key 可以传一个值 或多个
     */
    @SuppressWarnings("unchecked")
    public void del(String... key) {
        if (key != null && key.length > 0) {
            if (key.length == 1) {
                companyExecute.redisTemplate.delete(key[0]);
            } else {
                companyExecute.redisTemplate.delete((Collection<String>) CollectionUtils.arrayToList(key));
            }
        }
    }


    // ============================String=============================

    /**
     * 普通缓存获取
     *
     * @param key 键
     * @return 值
     */
    public Object get(String key) {
        return key == null ? null : companyExecute.redisTemplate.opsForValue().get(key);
    }


    /**
     * 普通缓存放入
     *
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */
    public boolean set(String key, Object value) {
        try {
            companyExecute.redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            logger.error("redis set方法 异常:" + e);
            return false;
        }
    }


    /**
     * 普通缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    public boolean set(String key, Object value, long time) {
        try {
            if (time > 0) {
                companyExecute.redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            } else {
                set(key, value);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 递增
     *
     * @param key   键
     * @param delta 要增加几(大于0)
     * @return 递增后的值
     */
    public long incr(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return companyExecute.redisTemplate.opsForValue().increment(key, delta);
    }


    /**
     * 递减
     *
     * @param key   键
     * @param delta 要减少几(小于0)
     * @return 递减后的值
     */
    public long decr(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递减因子必须大于0");
        }
        return companyExecute.redisTemplate.opsForValue().increment(key, -delta);
    }


    // ================================Map=================================

    /**
     * HashGet
     *
     * @param key  键 不能为null
     * @param item 项 不能为null
     * @return 值
     */
    public Object hget(String key, Object item) {
        return companyExecute.redisTemplate.opsForHash().get(key, item);
    }

    /**
     * 获取hashKey对应的所有键值
     *
     * @param key 键
     * @return 对应的多个键值
     */
    public Map<Object, Object> hmget(String key) {
        return companyExecute.redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     *
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false 失败
     */
    public boolean hmset(String key, Map<String, Object> map) {
        try {
            companyExecute.redisTemplate.opsForHash().putAll(key, map);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * HashSet 并设置时间
     *
     * @param key  键
     * @param map  对应多个键值
     * @param time 时间(秒)
     * @return true成功 false失败
     */
    public boolean hmset(String key, Map<String, Object> map, long time) {
        try {
            companyExecute.redisTemplate.opsForHash().putAll(key, map);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }


    /**
     * 向一张hash表中放入数据,如果不存在将创建
     *
     * @param key   键
     * @param item  项
     * @param value 值
     */
    public void hset(String key, String item, Object value) {
        companyExecute.redisTemplate.opsForHash().put(key, item, value);
    }


    /**
     * 向一张hash表中放入数据,如果不存在将创建
     *
     * @param key   键
     * @param item  项
     * @param value 值
     * @param time  时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
     * @return true 成功 false失败
     */
    public boolean hset(String key, String item, Object value, long time) {
        try {
            companyExecute.redisTemplate.opsForHash().put(key, item, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 删除hash表中的值
     *
     * @param key  键 不能为null
     * @param item 项 可以使多个 不能为null
     */
    public void hdel(String key, Object... item) {
        companyExecute.redisTemplate.opsForHash().delete(key, item);
    }


    /**
     * 判断hash表中是否有该项的值
     *
     * @param key  键 不能为null
     * @param item 项 不能为null
     * @return true 存在 false不存在
     */
    public boolean hHasKey(String key, String item) {
        return companyExecute.redisTemplate.opsForHash().hasKey(key, item);
    }

    /**
     * hash递增 如果不存在,就会创建一个 并把新增后的值返回
     *
     * @param key  键
     * @param item 项
     * @param by   要增加几(大于0)
     */
    public double hincr(String key, String item, double by) {
        return companyExecute.redisTemplate.opsForHash().increment(key, item, by);
    }


    /**
     * hash递减
     *
     * @param key  键
     * @param item 项
     * @param by   要减少记(小于0)
     */
    public double hdecr(String key, String item, double by) {
        return companyExecute.redisTemplate.opsForHash().increment(key, item, -by);
    }


    // ============================set=============================

    /**
     * 根据key获取Set中的所有值
     *
     * @param key 键
     * @return Set<Object>
     */
    public Set<Object> sGet(String key) {
        try {
            return companyExecute.redisTemplate.opsForSet().members(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    /**
     * 根据key获取Set中的count条数据
     *
     * @param key   键
     * @param count 想获取的数量
     * @return List<Object>
     */
    public List<Object> sGetListByCount(String key, int count) {
        return companyExecute.redisTemplate.opsForSet().pop(key, count);
    }


    /**
     * 根据value从一个set中查询,是否存在
     *
     * @param key   键
     * @param value 值
     * @return true 存在 false不存在
     */
    public boolean sHasKey(String key, Object value) {
        return companyExecute.redisTemplate.opsForSet().isMember(key, value);
    }


    /**
     * 将数据放入set缓存
     *
     * @param key    键
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long sSet(String key, Object... values) {
        return companyExecute.redisTemplate.opsForSet().add(key, values);
    }


    /**
     * 将set数据放入缓存
     *
     * @param key    键
     * @param time   时间(秒)
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long sSetAndTime(String key, long time, Object... values) {
        try {
            Long count = companyExecute.redisTemplate.opsForSet().add(key, values);
            if (time > 0) {
                expire(key, time);
            }
            return count;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return 0;
        }
    }


    /**
     * 获取set缓存的长度
     *
     * @param key 键
     * @return size
     */
    public Long sGetSetSize(String key) {
        return companyExecute.redisTemplate.opsForSet().size(key);
    }


    /**
     * 随机删除集合中一个元素
     */
    public Object sPop(String key) {
        return companyExecute.redisTemplate.opsForSet().pop(key);
    }

    /**
     * 移除值为value的
     *
     * @param key    键
     * @param values 值 可以是多个
     * @return 移除的个数
     */
    public long setRemove(String key, Object... values) {
        return companyExecute.redisTemplate.opsForSet().remove(key, values);
    }

    // ===============================list=================================


    /**
     * 获取list缓存的内容
     *
     * @param key   键
     * @param start 开始
     * @param end   结束 0 到 -1代表所有值
     * @return List<Object>
     */
    public List<Object> lGet(String key, long start, long end) {
        try {
            return companyExecute.redisTemplate.opsForList().range(key, start, end);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }


    /**
     * 获取list缓存的长度
     *
     * @param key 键
     * @return size
     */
    public Long lGetListSize(String key) {
        return companyExecute.redisTemplate.opsForList().size(key);
    }


    /**
     * 通过索引 获取list中的值
     *
     * @param key   键
     * @param index 索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
     * @return Object
     */
    public Object lGetIndex(String key, long index) {
        return companyExecute.redisTemplate.opsForList().index(key, index);
    }


    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return boolean
     */
    public Long lrSetObj(String key, Object value) {
        return companyExecute.redisTemplate.opsForList().rightPush(key, value);
    }


    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return boolean
     */
    public boolean lrSetObj(String key, Object value, long time) {
        try {
            companyExecute.redisTemplate.opsForList().rightPush(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return boolean
     */
    public boolean lrSetList(String key, List<Object> value) {
        try {
            companyExecute.redisTemplate.opsForList().rightPushAll(key, value);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 将list放入缓存
     * <p>
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return boolean
     */
    public boolean lrSetList(String key, List<Object> value, long time) {
        try {
            companyExecute.redisTemplate.opsForList().rightPushAll(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }

    //=========================================

    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return boolean
     */
    public Long llSet(String key, Object value) {
        return companyExecute.redisTemplate.opsForList().leftPush(key, value);
    }


    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return boolean
     */
    public boolean llSet(String key, Object value, long time) {
        try {
            companyExecute.redisTemplate.opsForList().leftPush(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 将list放入缓存
     *
     * @param key   键
     * @param value 值
     * @return boolean
     */
    public boolean llSet(String key, List<Object> value) {
        try {
            companyExecute.redisTemplate.opsForList().leftPushAll(key, value);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 将list放入缓存
     * <p>
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒)
     * @return boolean
     */
    public boolean llSet(String key, List<Object> value, long time) {
        try {
            companyExecute.redisTemplate.opsForList().leftPushAll(key, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }


    //===========================================

    /**
     * 根据索引修改list中的某条数据
     *
     * @param key   键
     * @param index 索引
     * @param value 值
     * @return boolean
     */
    public boolean lUpdateIndex(String key, long index, Object value) {
        try {
            companyExecute.redisTemplate.opsForList().set(key, index, value);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }


    /**
     * 移除N个值为value
     *
     * @param key   键
     * @param count 移除多少个
     * @param value 值
     * @return 移除的个数
     */
    public long lRemove(String key, long count, Object value) {
        return companyExecute.redisTemplate.opsForList().remove(key, count, value);
    }

    /**
     * 添加指定元素到有序集合中
     *
     * @param key   键
     * @param score 分数
     * @param value z值
     * @return 操作结果 true 成功 false 失败
     */
    public boolean sortSetAdd(String key, double score, Object value) {
        try {
            return redisTemplate.opsForZSet().add(key, value, score);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    /**
     * 有序集合中对指定成员的分数加上增量 increment
     *
     * @param key   键
     * @param value 值
     * @param i     增量
     * @return 操作结果 true 成功 false 失败
     */
    public double sortSetZincrby(String key, String value, double i) {
        if (key == null) {
            return -1;
        }
        try {
            if (redisTemplate.opsForZSet().incrementScore(key, value, i) == null) {
                return -1;
            }
            //返回新增元素后的分数
            return redisTemplate.opsForZSet().incrementScore(key, value, i);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return -1;
        }
    }

    /**
     * 根据有序集合指定分数范围获取元素
     *
     * @param key   键
     * @param start 开始分数
     * @param end   结束分数
     * @return 返回元素对象
     */
    public Set<Object> sortSetRangeByScore(String key, long start, long end) {
        try {
            return redisTemplate.opsForZSet().reverseRangeByScore(key, start, end);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    /**
     * 移除有序集合指定分数范围的元素
     *
     * @param key   键
     * @param start 开始分数
     * @param end   结束分数
     * @return 返回元素对象
     */
    public long sortSetRemRangeByScore(String key, long start, long end) {
        try {
            return redisTemplate.opsForZSet().removeRangeByScore(key, start, end);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return 0;
        }
    }

    /**
     * 获取set缓存的长度
     *
     * @param key 键
     * @return size
     */
    public long getSortSetSize(String key) {
        try {
            return redisTemplate.opsForZSet().zCard(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return -1;
        }
    }
}

