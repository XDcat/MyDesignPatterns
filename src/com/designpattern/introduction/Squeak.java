package com.designpattern.introduction;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        // 吱吱叫
        System.out.println("<<zhi zhi>>");
    }
}
