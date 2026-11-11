import com.springLearn.controller.AccountController;
import com.springLearn.controller.OrderController;
import com.springLearn.controller.UserController;
import com.springLearn.entity.Animal;
import com.springLearn.entity.MysqlDataSource;
import com.springLearn.factory.FactoryMethod;
import org.junit.jupiter.api.Test;
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
}
