package chapter2;

public class InstantiateBean implements HelloApi{
    private String message;

    public InstantiateBean() {
        this.message = "Hello World!";
    }

    public InstantiateBean(String message) {
        this.message = message;
    }

    //static factory method
    public static HelloApi staticFactory(String message) {
        return new InstantiateBean(message);
    }

    public HelloApi instanceFactory(String message) {
        return new InstantiateBean(message);
    }

    @Override
    public void sayHello() {
        System.out.println("hello impl 2 "+message);
    }
}
