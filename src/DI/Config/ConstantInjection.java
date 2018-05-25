package DI.Config;

import API.HelloApi;

public class ConstantInjection implements API.HelloApi {
    private String message;
    private int index;

    public ConstantInjection() {
        this.message = "default constructor";
        this.index = 0;
    }

    //@java.beans.ConstructorProperties({"message", "index"})
    //the above statement is not necessary
    public ConstantInjection(String message, int index) {
        this.message = message;
        this.index = index;
    }

    public static HelloApi staticFacotry(String message, int index) {
        return new ConstantInjection(message, index);
    }

    public HelloApi instanceFacotry(String message, int index) {
        return new ConstantInjection(message, index);
    }

    //setter
    public void setMessage(String message) {
        this.message = message;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
