package com.kun.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author kun
 * @data 2019/3/25 17:24
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;
    NonOwnerInvocationHandler(PersonBean person){
        this.person = person;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(person, args);
        }else if ("setHotOrNotRating".equals(method.getName())){
            return method.invoke(person, args);
        }else if (method.getName().startsWith("set")){
            return new IllegalAccessException();
        }
        return null;
    }
}
