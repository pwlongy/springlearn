package com.springLearn.annotation.controller.impl;

import com.springLearn.annotation.Service.ClothesService;
import com.springLearn.annotation.controller.ClothesController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *
 */
// 默认情况下这个value是可以省略的
//@Controller(value = "clothesControllerBean")
// @Controller("clothesControllerBean")
// 并且 @Controller 和 @Component 是等价的 @Component(value = "clothesControllerBean")
// 后面这个名字也可以不写，默认是类名首字母小写 比如当前类 ，他的 bean 名称就是 clothesControllerImpl
@Controller
public class ClothesControllerImpl implements ClothesController {
    private ClothesService clothesService;

    public ClothesControllerImpl(ClothesService clothesService) {
        this.clothesService = clothesService;
    }
    @Override
    public void save() {
        System.out.println("ClothesControllerImpl save start");
        clothesService.save();
        System.out.println("ClothesControllerImpl save end");
    }

    @Override
    public void update() {
        System.out.println("ClothesControllerImpl update start");
        clothesService.update();
        System.out.println("ClothesControllerImpl update end");
    }
}
