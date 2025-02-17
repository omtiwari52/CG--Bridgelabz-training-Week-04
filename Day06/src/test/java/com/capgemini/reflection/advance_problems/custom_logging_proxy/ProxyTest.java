package com.capgemini.reflection.advance_problems.custom_logging_proxy;



import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProxyTest {

    @Test
    void testProxyLogging() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create original object
        Greeting original = new Greet();

        // Create proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greet.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(original)
        );
        // Call methods via proxy
        proxyInstance.sayHello();
        proxyInstance.sayGoodBye("Harsh veer");
        // Get output as string
        String output = outputStream.toString();

        // Assertions
        assertTrue(output.contains("LOG: CALLING METHOD"));
        assertTrue(output.contains("Hello!"));
        assertTrue(output.contains("LOG: CALLING METHOD sayGoodBye"));
        assertTrue(output.contains("Good bye Harsh veer"));
    }
}