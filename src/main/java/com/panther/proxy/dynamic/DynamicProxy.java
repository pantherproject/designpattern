package com.panther.proxy.dynamic;

import com.panther.proxy.dynamic.handler.ProxyHandler;
import com.panther.proxy.dynamic.impl.Subject;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * Created by panther on 16-9-28.
 */
public class DynamicProxy {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new ProxyHandler(real));
        proxySubject.doSomething();
        //write proxySubject class binary data to file
        createProxyClassFile();
    }

    public static void createProxyClassFile() {
        String name = "ProxySubject";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{Subject.class});
        System.out.println(data);
        try {
            FileOutputStream outputStream = new FileOutputStream(name + ".class");
            outputStream.write(data);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
