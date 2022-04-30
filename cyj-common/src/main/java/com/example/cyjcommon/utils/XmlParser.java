package com.example.cyjcommon.utils;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 使用dom4j解析xml 工具类
 *
 * @author Declan
 */
public class XmlParser {


    /**
     * 生成空的xml文件
     *
     * @param xmlPath xmlPath
     */
    public static void createEmptyXmlFile(String xmlPath) {
        if (xmlPath == null || xmlPath.equals("")) {
            return;
        }
        Document document = DocumentHelper.createDocument();

        // 将doc转换为xml文档
        doc2XML(document, xmlPath);
    }

    /**
     * 将doc转换为xml文档
     *
     * @param doc      doc
     * @param fileName 文件名
     */
    public static void doc2XML(Document doc, String fileName) {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer;
        try {
            writer = new XMLWriter(new FileWriter(fileName), format);
            writer.write(doc);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据xml文件路径取得document对象
     *
     * @param xmlPath xmlPath
     * @return Document
     */
    public static Document getDocument(String xmlPath) {
        if (xmlPath == null || xmlPath.equals("")) {
            return null;
        }

        File file = new File(xmlPath);
        if (!file.exists()) {
            return null;
        }

        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(xmlPath);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

    /**
     * 得到XML的根节点
     *
     * @param document document
     * @return root
     */
    public static Element getRootNode(Document document) {
        if (document == null) {
            return null;
        }
        return document.getRootElement();
    }

    /**
     * 根据路径直接拿到根节点
     *
     * @param xmlPath xmlPath
     * @return Element
     */
    public static Element getRootNode(String xmlPath) {
        if (xmlPath == null || (xmlPath.trim()).equals("")) {
            return null;
        }
        Document document = getDocument(xmlPath);
        if (document == null) {
            return null;
        }
        return getRootNode(document);
    }

    /**
     * 得到指定元素的迭代器
     *
     * @param parent parent
     * @return Iterator<Element>
     */
    public static Iterator<Element> getIterator(Element parent) {
        if (parent == null) {
            return null;
        }
        return parent.elementIterator();
    }

    /**
     * 根据子节点名称得到指定的子节点
     *
     * @param parent    parent
     * @param childName childName
     * @return List<Element>
     */
    public static List<Node> getChildElements(Element parent, String childName) {
        childName = childName.trim();
        if (parent == null) {
            return null;
        }
        childName += "//";
        return parent.selectNodes(childName);
    }

    /**
     * 根据一个节点获取他所有的子节点
     *
     * @param node node
     * @return List<Element>
     */
    public static List<Element> getChildList(Element node) {
        if (node == null) {
            return null;
        }
        Iterator<Element> itr = getIterator(node);
        if (itr == null) {
            return null;
        }
        List<Element> childList = new ArrayList<>();
        while (itr.hasNext()) {
            Element kidElement = itr.next();
            if (kidElement != null) {
                childList.add(kidElement);
            }
        }
        return childList;
    }

    /**
     * 查询没有子节点的节点，使用xpath方式
     *
     * @param parent       parent       父节点名称
     * @param nodeNodeName 子节点名称
     */
    public static Node getSingleNode(Element parent, String nodeNodeName) {
        nodeNodeName = nodeNodeName.trim();
        String xpath = "//";
        if (parent == null) {
            return null;
        }
        if (nodeNodeName.equals("")) {
            return null;
        }
        xpath += nodeNodeName;
        return parent.selectSingleNode(xpath);
    }

    /**
     * 得到子节点，不使用xpath
     *
     * @param parent    parent
     * @param childName childName
     * @return Element
     */
    public static Element getChild(Element parent, String childName) {
        childName = childName.trim();
        if (parent == null) {
            return null;
        }
        if (childName.equals("")) {
            return null;
        }
        Element e = null;
        Iterator<Element> it = getIterator(parent);
        while (it != null && it.hasNext()) {
            Element k = it.next();
            if (k == null) {
                continue;
            }
            if (k.getName().equalsIgnoreCase(childName)) {
                e = k;
                break;
            }
        }
        return e;
    }

    /**
     * 判断节点是否还有子节点
     *
     * @param element element
     * @return boolean
     */
    public static boolean hasChild(Element element) {
        if (element == null) {
            return false;
        }
        return element.hasContent();
    }

    /**
     * 得到指定节点的属性的迭代器
     *
     * @param element element
     * @return Iterator
     */
    public static Iterator<Attribute> getAttrIterator(Element element) {
        if (element == null) {
            return null;
        }
        return element.attributeIterator();
    }

    /**
     * 遍历指定节点的所有属性
     *
     * @param element element
     * @return 节点属性的list集合
     */
    public static List<Attribute> getAttributeList(Element element) {
        if (element == null) {
            return null;
        }
        List<Attribute> attributeList = new ArrayList<>();
        Iterator<Attribute> atrIterator = getAttrIterator(element);
        if (atrIterator == null) {
            return null;
        }
        while (atrIterator.hasNext()) {
            Attribute attribute = atrIterator.next();
            attributeList.add(attribute);
        }
        return attributeList;
    }

    /**
     * 得到指定节点的指定属性
     *
     * @param element  element
     * @param attrName attrName
     * @return Attribute
     */
    public static Attribute getAttribute(Element element, String attrName) {
        attrName = attrName.trim();
        if (element == null) {
            return null;
        }
        if (attrName.equals("")) {
            return null;
        }
        return element.attribute(attrName);
    }

    /**
     * 获取指定节点指定属性的值
     *
     * @param element  element
     * @param attrName attrName
     * @return String 属性值
     */
    public static String attrValue(Element element, String attrName) {
        attrName = attrName.trim();
        if (element == null) {
            return null;
        }
        if (attrName.equals("")) return null;
        return element.attributeValue(attrName);
    }

    /**
     * 得到指定节点的所有属性及属性值
     *
     * @param element element
     * @return Map<String, String> 属性名--属性值
     */
    public static Map<String, String> getNodeAttrMap(Element element) {
        Map<String, String> attrMap = new HashMap<>();
        if (element == null) {
            return null;
        }
        List<Attribute> attributes = getAttributeList(element);
        if (attributes == null) {
            return null;
        }
        for (Attribute attribute : attributes) {
            String attrValueString = attrValue(element, attribute.getName());
            attrMap.put(attribute.getName(), attrValueString);
        }
        return attrMap;
    }

    /**
     * 遍历指定节点的下没有子节点的元素的text值
     *
     * @param element element
     * @return Map<String, String> 节点名--text值
     */
    public static Map<String, String> getSingleNodeText(Element element) {
        Map<String, String> map = new HashMap<>();
        if (element == null) {
            return null;
        }
        List<Element> kids = getChildList(element);
        for (Element tempElement : kids) {
            if (tempElement.getTextTrim() != null) {
                map.put(tempElement.getName(), tempElement.getTextTrim());
            }
        }
        return map;
    }

    /**
     * 遍历根节点下，没有子节点的元素节点，并将此节点的text值放入map中返回
     *
     * @param xmlFilePath xmlFilePath
     * @return Map<String, String>
     */
    public static Map<String, String> getSingleNodeText(String xmlFilePath) {
        xmlFilePath = xmlFilePath.trim();
        if (xmlFilePath.equals("")) {
            return null;
        }
        Element rootElement = getRootNode(xmlFilePath);
        if (!hasChild(rootElement)) {
            return null;
        }
        return getSingleNodeText(rootElement);
    }

    /**
     * 得到指定节点下所有子节点的属性集合
     *
     * @param parent parent
     * @return Map<Integer, Object>
     */
    public static Map<Integer, Object> getNameNodeAllKidsAttributeMap(Element parent) {
        Map<Integer, Object> allAttrMap = new HashMap<>();
        if (parent == null) return null;
        List<Element> childElements = getChildList(parent);
        if (childElements == null) return null;
        for (int i = 0; i < childElements.size(); i++) {
            Element childElement = childElements.get(i);
            Map<String, String> attrMap = getNodeAttrMap(childElement);
            allAttrMap.put(i, attrMap);
        }
        return allAttrMap;
    }

    /**
     * 遍历指定的节点下所有的节点 (递归)
     *
     * @param element     element
     * @param allkidsList allkidsList
     * @return List<Element>
     */
    public static List<Element> ransack(Element element, List<Element> allkidsList) {
        if (element == null) return null;
        if (hasChild(element)) {
            List<Element> kids = getChildList(element);
            for (Element e : kids) {
                allkidsList.add(e);
                ransack(e, allkidsList);
            }
        }
        return allkidsList;
    }

    /**
     * 得到指定节点下的指定节点集合
     *
     * @param element  element
     * @param nodeName nodeName
     * @return List<Element>
     */
    public static List<Element> getNameElement(Element element, String nodeName) {
        nodeName = nodeName.trim();
        List<Element> kidsElements = new ArrayList<>();
        if (element == null) {
            return null;
        }
        if (nodeName.equals("")) {
            return null;
        }
        List<Element> allKids = ransack(element, new ArrayList<>());
        if (allKids == null) {
            return null;
        }
        for (Element kid : allKids) {
            if (nodeName.equals(kid.getName())) {
                kidsElements.add(kid);
            }
        }
        return kidsElements;
    }

    /**
     * 验证节点是否唯一
     *
     * @param element element
     * @return int 节点唯一返回1,节点不唯一返回大于一的整型数据
     */
    public static int validateSingle(Element element) {
        int j = 1;
        if (element == null) {
            return j;
        }
        Element parent = element.getParent();
        List<Element> kids = getChildList(parent);
        for (Element kid : kids) {
            if (element.equals(kid)) {
                j++;
            }
        }
        return j;
    }
}
