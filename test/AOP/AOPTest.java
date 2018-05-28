package AOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void helloWorldTest() {
        ApplicationContext context =  new ClassPathXmlApplicationContext("AOP/HelloWorld");
        IHelloWorldService helloworldService =
                context.getBean("helloWorldService", IHelloWorldService.class);
        helloworldService.AOPHello();
    }
}
