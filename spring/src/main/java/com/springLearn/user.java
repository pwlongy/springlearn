package com.springLearn;

public class user {
    // 必须保证无参构造方法的存在才能保证Bean的正常实例化
    public user() {
        System.out.println("user 构造方法");
    }

    // 当没有无参构造方法只有有参构造方法的时候是无法实现Bean的实例化的
    public user(String name) {
        System.out.println("user 构造方法");
    }
}
