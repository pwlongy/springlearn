package com.springLearn.factory.CatFactory;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 */
// 实现 FactoryBean 接口，这就不是一个普通的类了，因为实现了特定的接口
// 这个类被我们称为 FactoryBean
// FactoryBean 本身是一个Bean，本身已经纳入IOC容器的管理了
// FactoryBean 的作用是协助 SPring 框架完成 bean 的实例化
// BeanFactory 是 Spring 框架的顶级接口，不是一个bean，本身是一个工厂，这个工厂负责实例化bena
public class CatFactory implements FactoryBean<Cat> {
    @Override
    public Cat getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        // true 表示单例
        // false 表示原型
        return true;
    }
}
