package AOP.Introduction;

public class IntroductionService implements IIntroductionService {
    @Override
    public void induct() {
        System.out.println("introduction");
    }
}