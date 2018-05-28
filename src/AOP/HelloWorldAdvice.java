package AOP;

public class HelloWorldAdvice {
    public void beforeAdvice() {
        System.out.println("before advice");
    }

    public void afterFinallyAdvice() {
        System.out.println("after finally advice");
    }
}
