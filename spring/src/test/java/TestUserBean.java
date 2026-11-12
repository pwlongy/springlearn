import com.springLearn.controller.AccountController;
import com.springLearn.controller.OrderController;
import com.springLearn.controller.UserController;
import com.springLearn.entity.Animal;
import com.springLearn.entity.MysqlDataSource;
import com.springLearn.factory.BeanLive.SevenLive;
import com.springLearn.factory.BeanLive.TenLive;
import com.springLearn.factory.BeanLive.fiveLive;
import com.springLearn.factory.CatFactory.Cat;
import com.springLearn.factory.FactoryMethod;
import com.springLearn.factory.ZoomFactory.Zoom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class TestUserBean {
    @Test
    public void testUserBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.insert();
    }

    @Test
    public void testOrderBean() {
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent2.xml");
     OrderController orderController = applicationContext.getBean("OrderController", OrderController.class);
     orderController.insert();

     // 测试内部bean的使用
     UserController userController =  applicationContext.getBean("UserController", UserController.class);
     userController.insert();
    }

    @Test
    public void testAnimalBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent.xml");
        Animal animal = applicationContext.getBean("AnimalBean", Animal.class);
        System.out.println(animal);
    }

    @Test
    public void testAnimalColorBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent.xml");
        Animal animal = applicationContext.getBean("AnimalColorBean", Animal.class);
        System.out.println(animal);
    }

    @Test
    public void testAnimalMasterBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent.xml");
        Animal animal = applicationContext.getBean("AnimalMasterBean", Animal.class);
        System.out.println(animal);
    }

    // 测试自动装配是否正常运行
    @Test
    public void  testAccountBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent3.xml");
        AccountController accountController = applicationContext.getBean("AccountController", AccountController.class);
        accountController.save();
    }

    // 测试 context namespace 的使用
    @Test
    public void testContextNamespace() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContent3.xml");
        MysqlDataSource mysqlDataSource = applicationContext.getBean("MysqlDataSource", MysqlDataSource.class);
        System.out.println(mysqlDataSource);
    }

    // 测试factory-method 的使用
    @Test
    public void testFactoryMethod() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryContent.xml");
        FactoryMethod factoryMethod = applicationContext.getBean("factoryMethodBean", FactoryMethod.class);
        System.out.println(factoryMethod);
    }

    // 测试使用
    @Test
    public void testFactoryMethod2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryContent.xml");
        Zoom zoom = applicationContext.getBean("zoom", Zoom.class);
        System.out.println(zoom);
    }
    @Test
    public void testFactoryMethod3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryContent.xml");
        Zoom zoom = applicationContext.getBean("zoom2", Zoom.class);
        System.out.println(zoom);
    }


//    生命周期的使用
    // 五步生命周期
    @Test
    public void testBeanLive() {
        // applicationContext 没有办法关闭容器， bean的destyor 方法是不会执行的
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryContent.xml");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("fiveContent.xml");
        fiveLive fiveLive = applicationContext.getBean("FiveLiveBean", fiveLive.class);
        System.out.println("4. 使用bean fiveLive = " + fiveLive);
        // 关闭容器
        applicationContext.close();
    }

    // 十步生命周期
    @Test
    public void testSevenLiveBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("liveContent.xml");
        TenLive tenLive = applicationContext.getBean("TenLiveBean", TenLive.class);
        System.out.println("4. 使用bean tenLive = " + tenLive);
        // 关闭容器
        applicationContext.close();
    }


    // 将自己 new 的对象纳入 IOC 容器的管理
    @Test
    public void testSelfBean() {
        Cat cat = new Cat();
        System.out.println(cat);

        // 将cat对象纳入IOC容器的管理
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerSingleton("cat", cat);
        // 从 spring 中的IOC 容器中获取该Bean
        Cat cat1 = beanFactory.getBean("cat", Cat.class);
        System.out.println(cat1);


    }
}
