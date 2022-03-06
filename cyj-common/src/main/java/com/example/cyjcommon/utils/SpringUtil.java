package com.example.cyjcommon.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil {

    private static ApplicationContext applicationContext = null;

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            SpringUtil.applicationContext = applicationContext;
        }
    }

    //通过name获取 Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

//        /**
//         * 动态注册bean
//         *
//         * @param name name
//         * @param clazz clazz
//         */
//        public static <T> T registBean(String name, Class<T> clazz) {
//                //获取BeanFactory
//                DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
//                //创建bean信息.
//                BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
//                //动态注册bean
//                defaultListableBeanFactory.registerBeanDefinition(name, beanDefinitionBuilder.getBeanDefinition());
//                return (T) clazz;
//        }

}
