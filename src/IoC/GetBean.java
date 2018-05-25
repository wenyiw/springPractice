package IoC;

import API.HelloApi;

public class GetBean implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("hello get bean");
    }
}
