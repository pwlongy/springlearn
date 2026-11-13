package com.springLearn.annotation.dao.impl;

import com.springLearn.annotation.dao.ClothesDao;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository(value = "clothesDaoBean")
public class ClothesDaoImpl implements ClothesDao {

    @Override
    public void save() {
        System.out.println("ClothesDaoImpl save");
    }

    @Override
    public void update() {
        System.out.println("ClothesDaoImpl update");
    }
}
