package com.xzit.work;

import com.xzit.model.Teacher;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class HomeWork1 {
    public static <T> T getBeanAndField(){
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read("day01_work/src/main/resources/bean.xml");
            Element rootElement = document.getRootElement();
            List<Element> bean = rootElement.elements("bean");
            for (Element beanElement : bean) {
                if("teacher".equals(beanElement.attributeValue("id"))){
                    String s = beanElement.attributeValue("class");
                    Class<?> aClass = Class.forName(s);
                    T o = (T)aClass.getConstructor().newInstance();
                    List<Element> property = beanElement.elements("property");
                    for (Element propertyElement : property) {
                        String name = propertyElement.attributeValue("name");
                        Field[] declaredFields = aClass.getDeclaredFields();
                        for (Field declaredField : declaredFields) {
                            if(declaredField.getName().equals(name)){
                                declaredField.setAccessible(true);
                                declaredField.set(o,propertyElement.attributeValue("value"));
                            }
                        }
                    }
                    return  o;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static <T> T getBeanAndMethod(){
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read("day01_work/src/main/resources/bean.xml");
            Element rootElement = document.getRootElement();
            List<Element> bean = rootElement.elements("bean");
            for (Element beanElement : bean) {
                if("teacher".equals(beanElement.attributeValue("id"))){
                    String s = beanElement.attributeValue("class");
                    Class<?> aClass = Class.forName(s);
                    T o = (T)aClass.getConstructor().newInstance();
                    List<Element> property = beanElement.elements("property");
                    for (Element propertyElement : property) {
                        String name = propertyElement.attributeValue("name");
                        String first = name.substring(0, 1).toUpperCase();
                        String last = name.substring(1);
                        String methodName = "set"+first+last;
                        Method method = aClass.getMethod(methodName, String.class);
                        method.invoke(o,propertyElement.attributeValue("value"));
                    }
                    return  o;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("1.1 通过解析xml文件，并用java动态代理机制创建Teacher类对象，然后通过Field类set方法为其属性赋值");
        Teacher teacher = getBeanAndField();
        System.out.println(teacher);
        System.out.println("1.2 通过解析xml文件，并用java动态代理机制创建Teacher类对象，然后通过setXXX方法为其属性赋值");
        Teacher teacher2 = getBeanAndField();
        System.out.println(teacher2);
    }
}
