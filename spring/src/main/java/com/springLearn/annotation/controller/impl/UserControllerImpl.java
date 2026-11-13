package com.springLearn.annotation.controller.impl;

import com.springLearn.annotation.Service.ClothesService;
import com.springLearn.annotation.Service.UserService;
import com.springLearn.annotation.controller.UserController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Controller
@RequiredArgsConstructor  // lombok 注解， 会自动生成一个构造方法， 并且会自动注入所有 final 修饰的字段
public class UserControllerImpl implements UserController {

    /**
     *  @Autowired 会自动导入参数
     *  @Autowired 可以作用与 方法 参数 字段 构造方法
     *  @Autowired 默认情况下会按照类型自动装配
     *  如果 userService 接口被多个类实现了，将会导致无法正确注入
     *  如果接口真的被多个类实现了， 那么可以使用 @Repository来指定名字， @Qualifier 来指定注入的实现类
     *  @Repository 不指定名字的话，默认会设置成为 class 类名 首字母小写
     * */
    @Autowired
    @Qualifier("UserService")
    private  UserService userService;

    /**
     * @Autowired 可以作用与方法上 也会自动注入
     *
     * */
    //@Autowired
    //public void setUserService(UserService userService) {
    //    this.userService = userService;
    //}

    /**
     * @Autowired 可以作用与构造方法上 也会自动注入
     * */
    //@Autowired
    //public UserControllerImpl(UserService userService) {
    //    this.userService = userService;
    //}

    /**
     * @Autowired 可以作用与参数上 也会实现自动注入
     * 如果存在多个参数，需要在每个参数前去添加 @Autowired
     * */
    //public UserControllerImpl(@Autowired UserService userService) {
    //    this.userService = userService;
    //}

    /**
     * 如果没有添加自动注入， 并且这个构造方法上是带有指定参数的， spring 框架会自动按照有参数的构造方法参数的类型去查找注入
     * 当存在多个构造方法的时候， 会有点调用无参构造方法
     * */
    //public UserControllerImpl(UserService userService) {
    //    this.userService = userService;
    //}

    @Override
    public void save() {
        System.out.println("UserControllerImpl save start");
        userService.save();
        System.out.println("UserControllerImpl save end");
    }

}
