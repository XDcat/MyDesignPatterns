package com.designpattern.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
       // 呱呱叫
        System.out.println("<<gua gua>>");
    }
}
