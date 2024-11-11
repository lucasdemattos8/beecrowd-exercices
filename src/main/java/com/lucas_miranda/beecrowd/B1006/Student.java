package com.lucas_miranda.beecrowd.B1006;

public class Student {

    private Double firstGrade;
    private Double secondGrade;
    private Double thirdGrade;

    public void setFirstGrade(Double firstGrade) {
        this.firstGrade = firstGrade;
    }
    public void setSecondGrade(Double secondGrade) {
        this.secondGrade = secondGrade;
    }
    public void setThirdGrade(Double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public Double getAverage(){
        return (firstGrade * 2 + secondGrade * 3 + thirdGrade * 5) / (2 + 3 + 5);
    }
    
}
