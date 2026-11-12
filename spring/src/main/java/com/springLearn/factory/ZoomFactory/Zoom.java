package com.springLearn.factory.ZoomFactory;

import java.util.Date;

/**
 *
 */
public class Zoom {
    private String name;
    private String address;
    private Date openTime;
    private Date closeTime;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "Zoom{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openTime='" + openTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                '}';
    }
}
