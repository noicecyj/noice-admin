package com.example.cyjcommon.utils;

import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.entity.bean.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Noice
 */
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    private static final Pattern NUMBER_PATTERN = Pattern.compile("([A-Za-z\\d]+)(_)?");

    public final static String MANY_TO_ONE = "ManyToOne";

    public final static String MANY_TO_MANY = "ManyToMany";

    public final static String ONE_TO_MANY = "OneToMany";

    public final static String YES = "是";

    public final static String NO = "否";

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

    public static Boolean ifDate(List<Property> poList) {
        for (Property po : poList) {
            if ("Date".equals(po.getPropertyType())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean ifTimestamp(List<Property> poList) {
        for (Property po : poList) {
            if ("Timestamp".equals(po.getPropertyType())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean ifLocalDateTime(List<Property> poList) {
        for (Property po : poList) {
            if ("LocalDateTime".equals(po.getPropertyType())) {
                return true;
            }
        }
        return false;
    }

//    public static Boolean ifManyToOne(List<Property> poList) {
//        for (Property po : poList) {
//            if (StringUtils.isNotEmpty(po.getPropertyOut()) &&
//                    StringUtils.isNotEmpty(po.getPropertyOutType()) &&
//                    "ManyToOne".equals(po.getPropertyOutType())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static Boolean ifManyToMany(List<Property> poList) {
//        for (Property po : poList) {
//            if (StringUtils.isNotEmpty(po.getPropertyOut()) &&
//                    StringUtils.isNotEmpty(po.getPropertyOutType()) &&
//                    "ManyToMany".equals(po.getPropertyOutType())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static Boolean ifOneToMany(List<Property> poList) {
//        for (Property po : poList) {
//            if (StringUtils.isNotEmpty(po.getPropertyOut()) &&
//                    StringUtils.isNotEmpty(po.getPropertyOutType()) &&
//                    "OneToMany".equals(po.getPropertyOutType())) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static String AppFileName(AppServiceBean po) {
        return BeanUtils.captureName(underline2Camel2(po.getAppServiceName())) + "Application.java";
    }

}
