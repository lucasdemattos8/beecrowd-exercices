package com.lucas_miranda.beecrowd.B1004;

public class Calculator {

    private int firstValue;
    private int secondValue;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public int getProduct(){
        return this.firstValue * this.secondValue;
    }
    
}