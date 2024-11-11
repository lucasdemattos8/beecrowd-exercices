package com.lucas_miranda.beecrowd.B1007;

public class Calculator {

    private int firstValue;
    private int secondValue;
    private int thirdValue;
    private int fourthValue;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
    public void setThirdValue(int thirdValue) {
        this.thirdValue = thirdValue;
    }
    public void setFourthValue(int fourthValue) {
        this.fourthValue = fourthValue;
    }

    public int getDifference(){
        return firstValue * secondValue - thirdValue * fourthValue;
    }

}
