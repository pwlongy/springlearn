package com.springLearn.annotation.Service.impl;

import com.springLearn.annotation.Service.ClothesService;
import com.springLearn.annotation.dao.ClothesDao;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service(value = "clothesServiceBean")
public class ClothesServiceImpl implements ClothesService {
    private ClothesDao clothesDao;

    public ClothesServiceImpl(ClothesDao clothesDao) {
        this.clothesDao = clothesDao;
    }
    @Override
    public void save() {
        System.out.println("ClothesServiceImpl save start");
        clothesDao.save();
        System.out.println("ClothesServiceImpl save end");
    }

    @Override
    public void update() {
        System.out.println("ClothesServiceImpl update start");
        clothesDao.update();
        System.out.println("ClothesServiceImpl update end");
    }
}
