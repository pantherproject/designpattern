package com.panther.aspect.impl;

import com.panther.aspect.PersonService;

/**
 * Created by panther on 16-9-28.
 */
public class PersonServiceBean implements PersonService {
    private String user = null;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public PersonServiceBean() {
        super();
    }

    public PersonServiceBean(String user) {
        super();
        this.user = user;
    }

    @Override
    public void aoptest() {
        p("aoptest()函数被调用");
    }


    public void p(Object o) {
        System.out.println(o);
    }
}
