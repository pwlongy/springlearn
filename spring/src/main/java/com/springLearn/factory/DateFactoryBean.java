package com.springLearn.factory;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class DateFactoryBean implements FactoryBean<Date> {

    private String dateStr;

    public DateFactoryBean(String dateStr) {
        this.dateStr = dateStr;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.parse(this.dateStr);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
