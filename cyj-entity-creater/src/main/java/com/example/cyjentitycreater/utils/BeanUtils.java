package com.example.cyjentitycreater.utils;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Noice
 * @version 1.0
 * @date 2020/1/21 14:46
 */
public class BeanUtils {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("([A-Za-z\\d]+)(_)?");

    private static final Pattern NUMBER_PATTERN2 = Pattern.compile("([A-Za-z\\d]+)(-)?");

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

    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return Character.toLowerCase(s.charAt(0)) + s.substring(1);
        }
    }

    public static String captureName(String name) {
        char[] cs = name.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    public static Boolean ifDate(List<PropertyPO> poList) {
        for (PropertyPO po : poList) {
            if ("Date".equals(po.getPropertyType())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean ifTimestamp(List<PropertyPO> poList) {
        for (PropertyPO po : poList) {
            if ("Timestamp".equals(po.getPropertyType())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean ifManyToOne(List<PropertyPO> poList) {
        for (PropertyPO po : poList) {
            if (StringUtils.isNotEmpty(po.getPropertyOut()) &&
                    StringUtils.isNotEmpty(po.getPropertyOutType()) &&
                    "ManyToOne".equals(po.getPropertyOutType())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean ifManyToMany(List<PropertyPO> poList) {
        for (PropertyPO po : poList) {
            if (StringUtils.isNotEmpty(po.getPropertyOut()) &&
                    StringUtils.isNotEmpty(po.getPropertyOutType()) &&
                    "ManyToMany".equals(po.getPropertyOutType())) {
                return true;
            }
        }
        return false;
    }

    public static String AppFileName(AppServicePO po) {
        return BeanUtils.captureName(BeanUtils.underline2Camel2(po.getAppServiceName())) + "Application.java";
    }

}
