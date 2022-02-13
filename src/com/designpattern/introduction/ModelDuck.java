package com.designpattern.introduction;

public class ModelDuck extends Duck{
    public ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
