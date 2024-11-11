package com.lucas_miranda.beecrowd.B1005;

public class Student {

    private Double firstGrade;
    private Double secondGrade;

    public void setFirstGrade(Double firstGrade) {
        this.firstGrade = firstGrade;
    }
    public void setSecondGrade(Double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getAverage(){
        return (firstGrade * 3.5 + secondGrade * 7.5) / (3.5 + 7.5);
    }
    
}
