package com.lucas_miranda.beecrowd.B1008;

public class Employee {

    private Integer ID;
    private Integer hoursWorked;
    private Double valuePerHour;
    
    public Employee(){
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double getSalary(){
        return hoursWorked * valuePerHour;
    }
}