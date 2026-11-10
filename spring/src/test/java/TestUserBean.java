import com.springLearn.controller.OrderController;
import com.springLearn.controller.UserController;
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
    }
}
