package chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {

    public static void main(String args[]){

        System.out.println("Enter the season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter the number of coffee that I drink on that season.");
        int number = scanner.nextInt();

        //issue on the old java, after scan int cannot scan string unless define it right after
        String adjec = scanner.nextLine();
        System.out.println("Enter the adjective.");
        adjec = scanner.nextLine();
        scanner.close();

        System.out.println("On a "+adjec+" "+season+" day, I drink a minimum of "+number+" cups of coffee.");
    }
}
