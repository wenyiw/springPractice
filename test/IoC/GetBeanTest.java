package IoC;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
1. read the xml config file to instantiate an IoC container
2. get Bean in different ways (interface oriented, not implementation oriented)
3. execute the service logic
*/

public class GetBeanTest {
    @Test
    public void getBeanTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("IoC/GetBean");

        //get by id
        HelloApi helloApi = beanFactory.getBean("bean1", HelloApi.class);
        helloApi.sayHello();

        //get by name
        helloApi = beanFactory.getBean("bean2", HelloApi.class);
        helloApi.sayHello();

        //get by type
        //if there are multiple beans of type exists, this won't work
//        helloApi = beanFactory.GetBean(HelloApi.class);
//        helloApi.sayHello();

        //when both id and name are defined
        //id="bean3" name="bean4"
        helloApi = beanFactory.getBean("bean3", HelloApi.class);
        helloApi.sayHello();
        helloApi = beanFactory.getBean("bean4", HelloApi.class);
        helloApi.sayHello();

        //when id and name are the same
        //id="bean5" name="bean5"
        helloApi = beanFactory.getBean("bean5", HelloApi.class);
        helloApi.sayHello();
        //to test when id and name are the same, only one if left
        String[] bean5Alias = beanFactory.getAliases("bean5");
        Assert.assertEquals(0, bean5Alias.length);

        //multiple names
        helloApi = beanFactory.getBean("bean11", HelloApi.class);
        helloApi.sayHello();
        String[] bean11Alias = beanFactory.getAliases("bean11");
        Assert.assertEquals(4, bean11Alias.length);

        //alias
        helloApi = beanFactory.getBean("bean20", HelloApi.class);
        helloApi.sayHello();
        helloApi = beanFactory.getBean("alias1", HelloApi.class);
        helloApi.sayHello();
        helloApi = beanFactory.getBean("alias2", HelloApi.class);
        helloApi.sayHello();
        String[] bean20Alias = beanFactory.getAliases("bean20");
        Assert.assertEquals(2, bean20Alias.length);
    }
}
