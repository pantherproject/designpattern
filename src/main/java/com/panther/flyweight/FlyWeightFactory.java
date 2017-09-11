package com.panther.flyweight;

import java.util.Hashtable;

/**
 * 工厂方法类
 * Created by panther on 17-9-11.
 */
public class FlyWeightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyWeightFactory() {

    }


    public FlyWeightFactory(Hashtable flyweights) {
        this.flyweights = flyweights;
    }

    public FlyWeight getFlyWeight(Object object) {
        FlyWeight flyWeight = (FlyWeight) flyweights.get(object);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight((String) object);
            flyweights.put(object, flyWeight);
        }

        return flyWeight;
    }

    public int getFlyWeightSize() {
        return flyweights.size();
    }

}
