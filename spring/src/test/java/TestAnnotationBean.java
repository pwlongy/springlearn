import com.springLearn.annotation.Service.impl.ClothesServiceImpl;
import com.springLearn.annotation.Service.impl.RescourceServiceImpl;
import com.springLearn.annotation.Service.impl.UserServiceImpl;
import com.springLearn.annotation.controller.ClothesController;
import com.springLearn.annotation.controller.UserController;
import com.springLearn.annotation.dao.impl.ClothesDaoImpl;
import com.springLearn.entrty.Customer;
import com.springLearn.user;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class TestAnnotationBean {
    @Test
    public void testAnnotationBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotatonContent.xml");
        ClothesController clothesController = applicationContext.getBean( "clothesControllerImpl", ClothesController.class);
        ClothesDaoImpl clothesDaoImpl = applicationContext.getBean( "clothesDaoBean", ClothesDaoImpl.class);
        ClothesServiceImpl clothesServiceImpl = applicationContext.getBean( "clothesServiceBean", ClothesServiceImpl.class);
        System.out.println(clothesController);
        System.out.println(clothesDaoImpl);
        System.out.println(clothesServiceImpl);
    }

    //测试自动注入功能
    @Test
    public void testAutoWire() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotatonContent.xml");
        UserController userController = applicationContext.getBean( "userControllerImpl", UserController.class);
        userController.save();
    }

    // 测试 Lombok
    // 在 Customer 类中并没有设置 getter 和 setter 方法， 但是依旧可以使用， 所以 Customer 类中已经生成了 getter 和 setter 方法
    @Test
    public void testLombok() {
        Customer customer = new Customer();
        customer.setName("张三");
        customer.setAge("18");
        System.out.println(customer);
    }

    // 测试使用 @resource 注解
    @Test
    public void testResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotatonContent.xml");
        RescourceServiceImpl rescourceServiceImpl = applicationContext.getBean( "rescourceServiceImpl", RescourceServiceImpl.class);
        rescourceServiceImpl.save();
    }
}
