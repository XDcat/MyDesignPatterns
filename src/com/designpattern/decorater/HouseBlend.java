package com.designpattern.decorater;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        this.description = "HouseBlend";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
