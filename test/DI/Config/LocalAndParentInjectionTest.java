package DI.Config;

import API.HelloApi;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LocalAndParentInjectionTest {
    @Test
    public void localAndParentInjectionTest() {
        //initialize parent container
        ApplicationContext parentBeanContext =
                new ClassPathXmlApplicationContext("DI/DIConfig/LocalAndParentInjection/ParentInjection");

        //initialize local container
        ApplicationContext beanContext = new ClassPathXmlApplicationContext(
                new String[] {"DI/DIConfig/LocalAndParentInjection/LocalInjection"}, parentBeanContext);

        HelloApi bean1 = beanContext.getBean("bean1", HelloApi.class);
        bean1.sayHello();//use local bean

        HelloApi bean2 = beanContext.getBean("bean2", HelloApi.class);
        bean2.sayHello();//uses parent bean
    }
}
