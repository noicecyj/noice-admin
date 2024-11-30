package noice.common.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * @author Noice
 */
@SuppressWarnings("unused")
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    /**
     * 生成文件
     *
     * @param path   路径
     * @param result 内容
     */
    public static void createFile(String path, String[] result, boolean reWrite, boolean append) throws IOException {
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
                fw = new FileWriter(file2, append);
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

    public static String JavaFileToString(String filePath, String fileName) {
        File file = new File(filePath + "/" + fileName + ".java");
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String SqlFileToString(String filePath, String fileName) {
        File file = new File(filePath + "/" + fileName + ".sql");
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String FileToString(String filePath, String fileName, String type) {
        return switch (type) {
            case "java" -> JavaFileToString(filePath, fileName);
            case "sql" -> SqlFileToString(filePath, fileName);
            default -> {
                logger.info("出错");
                yield null;
            }
        };
    }

    public static String mdStrBuilder(String operator, String env, String codeStr, String type) {
        StringBuilder stringBuilder = new StringBuilder();
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        stringBuilder.append("## ").append(format).append(" ").append(operator).append(" ").append(env).append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("```").append(type).append("\n");
        stringBuilder.append(codeStr);
        stringBuilder.append("```").append("\n");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static void createMdFile(String path, String fileName, String fileStr) throws IOException {
        String[] result = new String[2];
        result[0] = fileStr;
        result[1] = fileName + ".md";
        createMdFile(path, result);
    }

    public static void createMdFile(String path, String[] result) throws IOException {
        createMdFile(path, result, true);
    }

    public static void createMdFile(String path, String[] result, boolean reWrite) throws IOException {
        createMdFile(path, result, reWrite, true);
    }

    public static void createMdFile(String path, String[] result, boolean reWrite, boolean append) throws IOException {
        createFile(path, result, reWrite, append);
    }

    public static void createJavaFile(String path, String[] result) throws IOException {
        createFile(path, result, true, false);
    }

    public static void createJavaFile(String path, String fileName, String fileStr) throws IOException {
        String[] result = new String[2];
        result[0] = fileStr;
        result[1] = fileName + ".java";
        createJavaFile(path, result);
    }

    public static void createSqlFile(String path, String[] result) throws IOException {
        createFile(path, result, true, false);
    }

    public static void createSqlFile(String path, String fileName, String fileStr) throws IOException {
        String[] result = new String[2];
        result[0] = fileStr;
        result[1] = fileName + ".sql";
        createSqlFile(path, result);
    }

    public static void deleteJavaFile(String path, String fileName) {
        deleteFile(path, fileName + ".java");
    }

    public static void deleteSqlFile(String path, String fileName) {
        deleteFile(path, fileName + ".sql");
    }

    public static void deleteFile(String path, String fileName) {
        File file = new File(path + "/" + fileName);
        if (file.delete()) {
            logger.info("Deleted the file: " + file.getName());
        } else {
            logger.info("Failed to delete the file.");
        }
    }

    public static boolean deleteJavaFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            logger.info("Deleted the file: " + file.getName());
            return true;
        } else {
            logger.info("Failed to delete the file.");
            return false;
        }
    }

    public static List<Map<String, Object>> listToTree(List entityList, String primaryFieldName, String parentFieldName) {
        //返回的map Tree树形结构
        List<Map<String, Object>> treeMap = new ArrayList<>();
        //将传进的参数entityList转为MapList
        List<Map<String, Object>> listMap = JSON.parseObject(JSON.toJSONString(entityList), new TypeReference<>() {
        });
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
                    List<Map<String, Object>> children = JSON.parseObject(JSON.toJSONString(parentMap.get("children")), new TypeReference<>() {
                    });
                    if (children == null) {  //判断子级集合是否为空，为空则新创建List
                        children = new ArrayList<>();
                    }
                    //把当前map对象add到parentMap的子级List中去
                    children.add(map);
                    parentMap.put("children", children);
                }
            }
        });
        return treeMap;
    }

}
