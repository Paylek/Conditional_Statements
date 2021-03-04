package Conditional_Statement;

import java.util.Random;
import java.util.Scanner;

public class Task_06 {
    public static void main (String args[]) {

        int n = scannerInt();
        int[][] arr = initArray(n);
        arr = getEvenNumbers1(arr);
        Output(arr);
    }

    public static void Output(int arr[][]) {
        System.out.println("Отобранный массив: ");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] getEvenNumbers1(int [][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 1) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
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

    public static int[][] initArray(int n) {

        int [][] arr = new int[n][n];

        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {


                arr[i][j] = ran.nextInt(10);

            }
        }
        return arr;
    }



}
