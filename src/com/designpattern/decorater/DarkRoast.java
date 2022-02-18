package com.designpattern.decorater;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return  2.2;
    }
}
