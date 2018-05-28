package AOP;

public class HelloWorldService implements IHelloWorldService {
    @Override
    public void AOPHello() {
        System.out.println("Hello World in AOP!");
    }
}
