package DI.Config;

import API.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstantInjectionTest {
    @Test
    public void testConstructorDependencyInjectTest() {
        BeanFactory beanFactory =  new ClassPathXmlApplicationContext("DI/DIConfig/ConstantInjection");

        //constructor injection
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();

        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();

        HelloApi justValue = beanFactory.getBean("justValue", HelloApi.class);
        justValue.sayHello();

        //static factory method injection
        HelloApi byIndexS = beanFactory.getBean("byIndexS", HelloApi.class);
        byIndexS.sayHello();

        HelloApi byTypeS = beanFactory.getBean("byTypeS", HelloApi.class);
        byTypeS.sayHello();

        HelloApi byNameS = beanFactory.getBean("byNameS", HelloApi.class);
        byNameS.sayHello();

        HelloApi justValueS = beanFactory.getBean("justValueS", HelloApi.class);
        justValueS.sayHello();

        //instance factory method injection
        HelloApi byIndexI = beanFactory.getBean("byIndexI", HelloApi.class);
        byIndexI.sayHello();

        HelloApi byTypeI = beanFactory.getBean("byTypeI", HelloApi.class);
        byTypeI.sayHello();

        HelloApi byNameI = beanFactory.getBean("byNameI", HelloApi.class);
        byNameI.sayHello();

        HelloApi justValueI = beanFactory.getBean("justValueI", HelloApi.class);
        justValueI.sayHello();

        //setter injection
        HelloApi setter = beanFactory.getBean("setter", HelloApi.class);
        setter.sayHello();
    }
}
