package com.springLearn.factory.BeanLive;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 */
public class SevenLive implements BeanPostProcessor {

    // 自身是不参与bean得前处理以及后处理，只有xml配置文件的其他bean作用得上
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的befor方法执行， 即将开始初始化" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的after方法执行， 即将开始销毁" + beanName);
        return bean;
    }
}
