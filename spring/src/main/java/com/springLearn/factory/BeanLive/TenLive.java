package com.springLearn.factory.BeanLive;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 *
 */
public class TenLive implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String name;

    public TenLive() {
        System.out.println("1. TenLive constructor");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. TenLive setName");
    }

    public void initLive() {
        System.out.println("3. TenLive initLive");
    }

    public void destroyLive() {
        System.out.println("5. TenLive destroyLive");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("初始化阶段，类加载器：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("初始化阶段，bean工厂：" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("初始化阶段，bean名称：" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁前阶段。。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化阶段，实现InitializingBean接口的 afterPropertiesSet");
    }
}
