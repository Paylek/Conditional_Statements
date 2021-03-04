package Conditional_Statement;

import java.util.Random;
import java.util.Scanner;

public class Task_07 {

    public static void main (String args[]) {

        int n = scannerInt();
        initArray(n);
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

    public static void initArray(int n) {

        int [][] arr = new int[n][];

        Random ran = new Random();

        for (int i = 0; i < n; i++){

            arr[i] = new int[ran.nextInt(10)];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ran.nextInt(10);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
