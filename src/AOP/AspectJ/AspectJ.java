package AOP.AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJ {

    @Pointcut(value="execution(* AOP.Advice..*.sayBefore(..)) && args(param)", argNames = "param")
    public void beforePointcut(String param) {}

    @Before(value = "beforePointcut(param)", argNames = "param")
    public void beforeAdvice(String param) {
        System.out.println("before advice param:" + param);
    }
}
