package com.panther.flyweight;

/**
 * 实现类
 * Created by panther on 17-9-11.
 */
public class ConcreteFlyWeight extends FlyWeight {

    private String string;

    public ConcreteFlyWeight(String string) {
        this.string = string;
    }

    @Override
    public void operation() {

        System.out.println("Contrate---FlyWeight : " + string);

    }
}
