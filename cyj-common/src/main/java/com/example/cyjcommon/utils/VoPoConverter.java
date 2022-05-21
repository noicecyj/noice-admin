package com.example.cyjcommon.utils;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2020/1/21 14:46
 */
public class VoPoConverter {

    /**
     * 将src对象中的属性值复制到desc对象的同名属性中
     *
     * @param src  源
     * @param desc 目标
     */
    public static void copyProperties(Object src, Object desc) {
        DozerBeanMapper dozer = new DozerBeanMapper();
        dozer.map(src, desc);
    }

    /**
     * 将src对象中的属性值复制到新建的desc对象的同名属性中
     *
     * @param src       源
     * @param descClass 目标类型
     * @return 目标
     */
    public static <T> T copyProperties(Object src, Class<T> descClass) {
        DozerBeanMapper dozer = new DozerBeanMapper();
        return dozer.map(src, descClass);
    }

    /**
     * 将srcList中的元素复制到元素类型为descClass的List集合中
     *
     * @param srcList   源
     * @param descClass 目标类型
     * @return 目标
     */
    public static <T> List<T> copyList(@SuppressWarnings("rawtypes") List srcList, Class<T> descClass) {
        List<T> descList = new ArrayList<>();
        if (srcList != null) {
            for (Object obj : srcList) {
                T t = VoPoConverter.copyProperties(obj, descClass);
                descList.add(t);
            }
        }
        return descList;
    }

}

