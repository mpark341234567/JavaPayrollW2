package org.example;
public class Payroll {
    public int hoursWorked;
    public int dependents;
    public Payroll() {
        hoursWorked = 0;
        dependents = 0;
    }
    public Payroll(int hours, int deps) {
        hoursWorked = hours;
        dependents = deps;
    }
    public void setHoursWorked(int hours) {
        hoursWorked = hours;
    }
    public void setDependents(int deps) {
        dependents = deps;
    }
    public double calculateGrossPay() {
        if (hoursWorked > 40) {
            double overtimePay = (hoursWorked - 40) * 16.78 * 1.5;
            return 40 * 16.78 + overtimePay;
        }
        else{
            return hoursWorked * 16.78;
        }
        
    }
    public double calculateSocSec(){//6%
        return calculateGrossPay() * 0.06;
    }
    public double calculateFedTax(){//14%
        return calculateGrossPay() * 0.14;
    }
    public double calculateStTax(){//5%
        return calculateGrossPay() * 0.05;
    }
    public double calculateUnion(){
        return 10.00;
    }
    public double calculateIns(){
        if (dependents >= 3){
            return 35.00;
        }
        else{
            return 15.00;
        }
    }
    public double calculateNet(){
        return calculateGrossPay() - 
        (calculateSocSec() + calculateFedTax() + calculateStTax() + calculateUnion() + calculateIns());
    }
}
