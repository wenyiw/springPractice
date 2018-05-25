package IoC;

public class GetBean implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("hello impl 1");
    }
}
