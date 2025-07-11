package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Payroll Program!\n");

    System.out.println("How many hours did you work this week? ");
    Scanner scanner = new Scanner(System.in);
    int hoursWorked = scanner.nextInt();

    System.out.println("\nHow many dependents do you have? ");
    int dependents = scanner.nextInt();
    
    scanner.close();

    Payroll payroll = new Payroll(hoursWorked, dependents);

    System.out.printf("\n%-20s: %d%n", "Hours: ", payroll.getHoursWorked());
    System.out.printf("%-20s: %d%n", "Dependents: ", payroll.getDependents());
    System.out.printf("%-20s: $%.2f%n", "Gross Pay: ", payroll.calculateGrossPay());
    System.out.printf("%-20s: $%.2f%n", "Social Security: ", payroll.calculateSocSec());
    System.out.printf("%-20s: $%.2f%n", "Federal Tax: ", payroll.calculateFedTax());      
    System.out.printf("%-20s: $%.2f%n", "State Tax: ", payroll.calculateStTax());
    System.out.printf("%-20s: $%.2f%n", "Union Dues: ", payroll.calculateUnion());
    System.out.printf("%-20s: $%.2f%n", "Insurance: ", payroll.calculateIns());
    System.out.printf("%-20s: $%.2f%n", "Net Pay: ", payroll.calculateNet());

    System.out.println("\nThank you for using the Payroll Program!");
  }
}
