import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    @Test
    public void testBean() {
        // 获取Spring 容器的应用上下文对象（获取整个IOC容器）
        // 一下代码白哦是从类路径当中加载 beans.xml 文件，使用这个方式 spring配置文件必须放在类路径下
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // 从 spring 的IOC容器中获取 id = "userBean" 的bean对象
        Object bean = applicationContext.getBean("userBean");
        System.out.println(bean);

        // 默认情况下再次获取bean的时候不会创建新的 bean 对象
        Object bean2 = applicationContext.getBean("userBean");
        System.out.println(bean2);
    }
}
