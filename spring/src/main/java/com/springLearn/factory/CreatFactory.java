package com.springLearn.factory;

/**
 *
 */
public class CreatFactory {
    // 如果存在其他静态工厂,直接在后面添加,形成了一个简单工厂模式, 这个文件只做工厂的创建
    // 简单工厂的缺点就是在工厂类中, 如果存在多个静态方法, 那么就需要在工厂类中维护多个方法, 不利于维护
    public static FactoryMethod get() {
        return new FactoryMethod();
    }

}
