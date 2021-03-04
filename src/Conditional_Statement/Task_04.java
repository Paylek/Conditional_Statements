package Conditional_Statement;

import java.util.Random;
import java.util.Scanner;

public class Task_04 {

    public static void main (String args[]) {

        int n = scannerInt();
        int [] arr = initArray(n);
        int min = 0, max = 0, sum = 0, pr = 1;
        min = getEvenNumbers1(arr, min);
        max = getEvenNumbers2(arr, max);
        sum = getEvenNumbers3(arr);
        pr = getEvenNumbers4(arr, min, max);
        Output(sum, pr);

    }

    public static void Output(int sum, int pr) {
        System.out.println("Сумма: " + sum + " Произведение: " + pr);
    }

    public static int getEvenNumbers3(int [] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum * (-1);
    }

    public static int getEvenNumbers4(int [] arr, int min, int max) {

        int pr = 1;

        for (int i = min; i <= max; i++) {
            pr *= arr[i];
        }

        return pr;
    }

    public static int getEvenNumbers1(int [] arr, int min) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] < arr[i]) {
                min = arr[i - 1];
                arr[i] = arr[i - 1];

            }
            else {
                min = arr[i];
            }

        }

        return min;

    }

    public static int getEvenNumbers2(int [] arr, int max) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i]) {
                max = arr[i - 1];
                arr[i] = arr[i - 1];

            }
            else {
                max = arr[i];
            }

        }

        return max;

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

    public static int[] initArray(int n) {

        int [] arr = new int[n];

        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10) ;

        }
        return arr;
    }

}
