package AOP.Advice;

public interface IHelloWorldService {
    public void AOPHello();

    public void sayBefore(String param);

    public boolean sayAfterReturning();

    public void sayAfterThrowing();

    public boolean sayAfterFinally();

    public void sayAround(String param);
}
