package com.panther.aspect;

import com.panther.aspect.impl.PersonServiceBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * Created by panther on 16-9-28.
 */
public class ProxyFactory implements InvocationHandler {
    private Object targetObject;



    public Object creatProxyInstance(Object obj){
        this.targetObject = obj;
        return Proxy.newProxyInstance(this.targetObject.getClass()
                .getClassLoader(), this.targetObject.getClass()
                .getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PersonServiceBean personServiceBean = (PersonServiceBean) this.targetObject;
        Object result = null;
        if (personServiceBean.getUser() != null) {
            result = method.invoke(personServiceBean, args);
        }
        return result;
    }
}
