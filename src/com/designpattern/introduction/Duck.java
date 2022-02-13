package com.designpattern.introduction;

public abstract class Duck {
    /* 变化的部分 */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /* 初始化变化的部分 */
    public Duck(){
    }
    /* 应用变化的部分 */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    /* 动态更新变化的部分 */

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /* 不变的部分 */
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public abstract void display();

}


