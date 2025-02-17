package com.capgemini.reflection.advance_problems.custom_logging_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {
    private final Object obj;

    public LoggingInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[]args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("LOG: CALLING METHOD " + method.getName());
        return method.invoke(obj,args);
    }


}
