package com.panther.flyweight;

/**
 * Created by panther on 17-9-11.
 */
public class FlyweightPattern {

    FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

    FlyWeight flyWeight1;

    FlyWeight flyWeight2;

    FlyWeight flyWeight3;

    FlyWeight flyWeight4;

    FlyWeight flyWeight5;

    FlyWeight flyWeight6;

    public FlyweightPattern() {

        flyWeight1 = flyWeightFactory.getFlyWeight("Google");

        flyWeight2 = flyWeightFactory.getFlyWeight("Qutr");

        flyWeight3 = flyWeightFactory.getFlyWeight("Google");

        flyWeight4 = flyWeightFactory.getFlyWeight("Google");

        flyWeight5 = flyWeightFactory.getFlyWeight("google");

        flyWeight6 = flyWeightFactory.getFlyWeight("google");

    }


    public void showFlyWeight() {
        flyWeight1.operation();
        flyWeight2.operation();
        flyWeight3.operation();
        flyWeight4.operation();
        flyWeight5.operation();
        flyWeight6.operation();
        int objSize = flyWeightFactory.getFlyWeightSize();

        System.out.println("objSize = " + objSize);
    }


    public static void main(String[] args) {
        System.out.println(" The FlyWeight Pattern !");

        FlyweightPattern flyweightPattern = new FlyweightPattern();

        flyweightPattern.showFlyWeight();

    }


}
