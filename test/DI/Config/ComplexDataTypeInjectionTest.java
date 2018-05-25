package DI.Config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexDataTypeInjectionTest {

    //list
    @Test
    public void listInjectionTest() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("DI/DIConfig/ComplexDataTypeInjection");

        ComplexDataTypeInjection listBean = beanFactory.getBean("listBean", ComplexDataTypeInjection.class);
        Assert.assertEquals(3, listBean.getList().size());
    }

    //set
    @Test
    public void setInjectionTest() {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("DI/DIConfig/ComplexDataTypeInjection");

        ComplexDataTypeInjection setBean = beanFactory.getBean("setBean", ComplexDataTypeInjection.class);
        Assert.assertEquals(3, setBean.getSet().size());
    }

    //array 1d and 2d
    @Test
    public void arrayInjectionTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("DI/DIConfig/ComplexDataTypeInjection");

        ComplexDataTypeInjection arrayBean = beanFactory.getBean("arrayBean", ComplexDataTypeInjection.class);
        System.out.println(arrayBean.getArray1().length);
        System.out.println(arrayBean.getArray2().length);
        System.out.println(arrayBean.getArray2()[0].length);
        System.out.println(arrayBean.getArray2()[1].length);
    }


    //map
    @Test
    public void mapInjectionTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("DI/DIConfig/ComplexDataTypeInjection");

        ComplexDataTypeInjection mapBean = beanFactory.getBean("mapBean", ComplexDataTypeInjection.class);
        System.out.println(mapBean.getMap().size());
    }

    //property
    @Test
    public void propertyInjectionTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("DI/DIConfig/ComplexDataTypeInjection");
        ComplexDataTypeInjection propertiesBean = beanFactory.getBean("propertiesBean", ComplexDataTypeInjection.class);
        System.out.println(propertiesBean.getProperty().size());
        System.out.println(propertiesBean.getProperty().containsValue("22"));

        ComplexDataTypeInjection propertiesBean2 = beanFactory.getBean("propertiesBean2", ComplexDataTypeInjection.class);
        System.out.println(propertiesBean2.getProperty().size());
        System.out.println(propertiesBean2.getProperty().containsKey("1"));
        System.out.println(propertiesBean2.getProperty().containsKey("2"));
        System.out.println(propertiesBean2.getProperty().containsKey("3"));
        System.out.println(propertiesBean2.getProperty().containsKey("4"));
        System.out.println(propertiesBean2.getProperty().containsKey("5"));
        System.out.println(propertiesBean2.getProperty().containsValue("11"));
    }
}
