package Conditional_Statement;

import java.util.Scanner;
import java.lang.Math;


public class Task_01 {
    public static void main (String args[]) {
        int a = scannerInt();
        int b = scannerInt();
        int r = scannerInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) / 2);

        if (c < (2 * r)) {
            System.out.println("Картонка закроет!");
        }
        else{
            System.out.println("Картонка не закроет!");
        }
    }

    public static int scannerInt() {

        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Введите размер: \r");

        while(!in.hasNextInt()) {

            in.next();

            System.out.println("Введите правильно размер: \r");
        }
        number = in.nextInt();

        return number;

    }
}