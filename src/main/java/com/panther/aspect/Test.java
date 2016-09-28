package com.panther.aspect;

import com.panther.aspect.impl.PersonServiceBean;

/**
 * Created by panther on 16-9-28.
 */
public class Test {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        PersonService personService = new PersonServiceBean();
        PersonService service = (PersonService) proxyFactory.creatProxyInstance(personService);
        service.aoptest();
    }
}
