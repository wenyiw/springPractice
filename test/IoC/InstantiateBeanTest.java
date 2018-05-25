package IoC;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiateBeanTest {
    @Test
    public void instantiateBeanTest() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("IoC/InstantiateBean");

        //instantiate bean by constructor
        HelloApi bean = beanFactory.getBean("bean1", HelloApi.class);
        bean.sayHello();
        bean = beanFactory.getBean("bean2", HelloApi.class);
        bean.sayHello();

        //by static factory
        bean = beanFactory.getBean("bean3", HelloApi.class);
        bean.sayHello();

        //by instance factory
        bean = beanFactory.getBean("bean4", HelloApi.class);
        bean.sayHello();
    }
}
