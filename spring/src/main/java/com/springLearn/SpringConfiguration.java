package com.springLearn;

import com.springLearn.annotation.dao.impl.RescourceDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 *
 */
@Configuration // 将以下类作为配置类，代替配置文件， 被这个configuration 注解标注的类也会纳入IOC容器的管理， 它本身也是一个bean
@ComponentScan("com.springLearn.annotation") // 指定需要扫描的包， 这个包下的所有注解标注都会实例化
public class SpringConfiguration {
    //@Bean // 默认情况下这个bean的名字就是方法名
    @Bean(name = "date") // 自定义名字
    public Date getDate() {
        return new Date();
    }
}
