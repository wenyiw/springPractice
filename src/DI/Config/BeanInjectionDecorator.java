package DI.Config;

import API.HelloApi;

public class BeanInjectionDecorator implements HelloApi{
    private HelloApi helloApi;

    public BeanInjectionDecorator() {
    }

    public BeanInjectionDecorator(HelloApi helloApi) {
        this.helloApi = helloApi;
    }
    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    @Override
    public void sayHello() {
        System.out.println("start helloApi.sayHello()");
        helloApi.sayHello();
        System.out.println("end helloApi.sayHello()");
    }
}
