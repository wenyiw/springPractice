package DI.Config;

import API.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInjectionTest {
    @Test
    public void beanInjectionTest() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("DI/DIConfig/BeanInjection");

        //inject through constructor
        HelloApi bean3 = beanFactory.getBean("bean3", HelloApi.class);
        bean3.sayHello();

        //inject through setter
        HelloApi bean4 = beanFactory.getBean("bean4", HelloApi.class);
        bean4.sayHello();
    }
}
