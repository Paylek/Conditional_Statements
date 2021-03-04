package Conditional_Statement;

import java.util.Scanner;

public class Task_02 {

    public static void main (String args[]) {
        int n = scannerInt();

        switch (n) {
            case 1, 8:
                System.out.println("Today is Monday!");
                break;
            case 2, 9:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("Wrong number entered!");
        }

    }
    public static int scannerInt() {

        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Введите число: \r");

        while(!in.hasNextInt() ) {

            in.next();

            System.out.println("Введите правильно число: \r");
        }
        number = in.nextInt();

        return number;

    }
}
