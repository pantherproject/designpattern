package com.panther.proxy.dynamic;


import com.panther.proxy.dynamic.impl.Subject;

/**
 * call doSomething
 * Created by panther on 16-9-28.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething");
    }
}
