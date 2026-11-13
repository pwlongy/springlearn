package com.springLearn.annotation.dao.impl;

import com.springLearn.annotation.dao.RescouceDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class RescourceDaoImpl implements RescouceDao {
    @Override
    public void save() {
        System.out.println("资源保存成功");
    }
}
