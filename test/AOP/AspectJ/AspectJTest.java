package AOP.AspectJ;

import AOP.Advice.IHelloWorldService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJTest {
    @Test
    public void aspectJTest() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/AspectJ/AspectJ");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayBefore("before");
        System.out.println("======================================");
    }
}
