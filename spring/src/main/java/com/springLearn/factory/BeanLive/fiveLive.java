package com.springLearn.factory.BeanLive;

/**
 *
 */
public class fiveLive {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("2. fiveLive setName");
    }

    public fiveLive() {
        System.out.println("1. fiveLive constructor");
    }

    public void initLive() {
        System.out.println("3. fiveLive initLive");
    }

    public void destroyLive() {
        System.out.println("5. fiveLive destroyLive");
    }

}
