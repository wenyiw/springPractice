package DI.DependsOnTest;

import DI.DependsOn.DependentBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DependsOnTest {
    @Test
    public void dependsOnTest() throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DI/DependsOn/DependsOn");

        //we must call this, or our destroy method will not be called
        context.registerShutdownHook();
        DependentBean dependentBean =
                context.getBean("dependentBean", DependentBean.class);
        dependentBean.write("aaa");
    }
}
