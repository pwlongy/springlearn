package com.springLearn.entity;

import java.util.Arrays;

/**
 *
 */

public class Animal {
    private String name;
    private Integer age;
    private String[] LoveColor;
    private Master[] master;

    public void setMaster(Master[] master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", LoveColor=" + Arrays.toString(LoveColor) +
                ", master=" + Arrays.toString(master) +
                '}';
    }

    public String[] getLoveColor() {
        return LoveColor;
    }

    public void setLoveColor(String[] loveColor) {
        LoveColor = loveColor;
    }

    // setter注入
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

}
