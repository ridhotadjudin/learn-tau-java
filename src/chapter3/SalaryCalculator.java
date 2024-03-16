package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salesperson get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

public class SalaryCalculator {

    public static void main(String args[]){

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > 10){
            salary += bonus;
        }

        System.out.println("The employee's pay is $"+salary);

    }
}