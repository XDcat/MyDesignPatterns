package com.designpattern.strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        // 用翅膀飞
        System.out.println("I'm flying!");
    }
}
