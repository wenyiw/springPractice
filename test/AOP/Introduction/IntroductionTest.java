package AOP.Introduction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroductionTest {
    @Test
    public void introductionTest() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/Introduction/Introduction");
        IIntroductionService introductionService =
                ctx.getBean("helloWorldService", IIntroductionService.class);
        introductionService.induct();
        System.out.println("======================================");
    }
}
