package com.designpattern.introduction;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
       // 不会飞
        System.out.println("I can't fly!");
    }
}
