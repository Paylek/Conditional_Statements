package Conditional_Statement;

import java.util.Random;
import java.util.Scanner;

public class Task_05 {

    public static void main (String args[]) {
        int n = scannerInt();
        int[] arr = initArray(n);
        arr = sorting(arr, n);
        Output(arr);
    }

    public static int [] sorting(int [] arr, int n) {

        for (int i = arr.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void Output(int arr[]) {
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]);
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
