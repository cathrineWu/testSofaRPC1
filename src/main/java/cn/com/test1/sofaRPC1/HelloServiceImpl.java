package cn.com.test1.sofaRPC1;

public class HelloServiceImpl implements HelloService {
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}