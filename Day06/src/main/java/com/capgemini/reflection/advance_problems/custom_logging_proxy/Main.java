package com.capgemini.reflection.advance_problems.custom_logging_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greet();

        // create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greet.class.getClassLoader(),
                new Class[] {Greeting.class},
                new LoggingInvocationHandler(greet)
        );

        proxyInstance.sayHello();
        proxyInstance.sayGoodBye("Harsh veer singh");
    }
}
