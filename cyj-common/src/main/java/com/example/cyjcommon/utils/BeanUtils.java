package com.example.cyjcommon.utils;

import com.alibaba.fastjson2.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Noice
 */
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    private static final Pattern NUMBER_PATTERN = Pattern.compile("([A-Za-z\\d]+)(_)?");

    public static String underline2Camel(String line) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = NUMBER_PATTERN.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(matcher.start() == 0 ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0)));
            int index = word.lastIndexOf('_');
            if (index > 0) {
                sb.append(word.substring(1, index).toLowerCase());
            } else {
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    public static String captureName(String name) {
        char[] cs = name.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    /**
     * 生成文件
     *
     * @param path   路径
     * @param result 内容
     */
    public static void createJavaFile(String path, String[] result, boolean reWrite) throws IOException {
        File file = new File(path);
        File file2 = new File(path + "/" + result[1]);
        //如果文件不存在，创建一个文件
        if (file.mkdirs()) {
            logger.info("生成路径文件夹");
        }
        if (file2.createNewFile()) {
            logger.info("生成文件,路径为：{}", path + "/" + result[1]);
            reWrite = true;
        }
        if (reWrite) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(file2);
                bw = new BufferedWriter(fw);
                bw.write(result[0]);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                assert bw != null;
                bw.close();
                fw.close();
            }
        }
    }

    public static void createJavaFile(String path, String[] result) throws IOException {
        createJavaFile(path, result, true);
    }

    public static void deleteJavaFile(String path, String fileName) {
        File file = new File(path + "/" + fileName);
        if (file.delete()) {
            logger.info("Deleted the file: " + file.getName());
        } else {
            logger.info("Failed to delete the file.");
        }
    }

    public static void deleteJavaFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            logger.info("Deleted the file: " + file.getName());
        } else {
            logger.info("Failed to delete the file.");
        }
    }

    private static final Pattern NUMBER_PATTERN2 = Pattern.compile("([A-Za-z\\d]+)(-)?");

    public static String underline2Camel2(String line) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = NUMBER_PATTERN2.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(matcher.start() == 0 ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0)));
            int index = word.lastIndexOf('-');
            if (index > 0) {
                sb.append(word.substring(1, index).toLowerCase());
            } else {
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }


    public static List<Map<String, Object>> listToTree(List entityList, String primaryFieldName, String parentFieldName) {
        //返回的map Tree树形结构
        List<Map<String, Object>> treeMap = new ArrayList<>();
        //将传进的参数entityList转为MapList
        List<Map<String, Object>> listMap = JSON.parseObject(JSON.toJSONString(entityList), List.class);
        //声明一个map用来存listMap中的对象，key为对象id，value为对象本身
        Map<String, Map<String, Object>> entityMap = new Hashtable<>();
        //循环listMap把map对象put到entityMap中去
        listMap.forEach(map -> entityMap.put(map.get(primaryFieldName).toString(), map));
        //循环listMap进行Tree树形结构组装
        listMap.forEach(map -> {
            //获取map的pid
            Object pid = map.get(parentFieldName);
            //判断pid是否为空或者为0，为空说明是最顶级，直接add到返回的treeMap中去
            if (pid == null || StringUtils.equals(pid.toString(), "0")) {
                treeMap.add(map);
            } else {
                //如果pid不为空也不为0，是子集
                // 根据当前map的pid获取上级 parentMap
                Map<String, Object> parentMap = entityMap.get(pid.toString());
                if (parentMap == null) { //如果parentMap为空，则说明当前map没有父级，当前map就是顶级
                    treeMap.add(map);
                } else {
                    //如果parentMap不为空，则当前map为parentMap的子级
                    //取出parentMap的所有子级的List集合
                    List<Map<String, Object>> children = (List<Map<String, Object>>) parentMap.get("children");
                    if (children == null) {  //判断子级集合是否为空，为空则新创建List
                        children = new ArrayList<>();
                        parentMap.put("children", children);
                    }
                    //把当前map对象add到parentMap的子级List中去
                    children.add(map);
                }
            }
        });
        return treeMap;
    }

}
