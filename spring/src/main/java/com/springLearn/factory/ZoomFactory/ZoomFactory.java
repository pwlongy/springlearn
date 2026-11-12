package com.springLearn.factory.ZoomFactory;

/**
 *
 */
public class ZoomFactory {
    // 只创建 zoom 对象的工厂
    public Zoom get() {
        return new Zoom();
    }
}
