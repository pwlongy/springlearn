package com.springLearn.annotation.Service.impl;

import com.springLearn.annotation.Service.RescourceService;
import com.springLearn.annotation.dao.RescouceDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class RescourceServiceImpl implements RescourceService {

    /**
     * @Resource 会默认按照名字进行装配
     * 只在你不写 name 属性时才生效；一旦显式指定了 name，就只按这个名字找，找不到直接抛异常，不会回退到按类型装配。
     * @Resource 不写name字段的时候字段名字找不到之后，才会按照类型进行装配
     *
     * */
    @Resource(name = "rescourceDaoImpl123")
    private RescouceDao rescouceDao;

    public void setRescouceDao(RescouceDao rescouceDao) {
        this.rescouceDao = rescouceDao;
    }

    @Override
    public void save() {
        System.out.println("RescourceServiceImpl save start");
        rescouceDao.save();
        System.out.println("RescourceServiceImpl save end");

    }
}
