package com.designpattern.introduction;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
       // 呱呱叫
        System.out.println("<<gua gua>>");
    }
}
