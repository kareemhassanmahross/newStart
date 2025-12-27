package newStart.daytwo;

import java.util.Scanner;

public class cashire {
    Scanner sc = new Scanner(System.in);
    public int iterations ;
    public int[] numbers ;
    public static void main(String[] args) {
        cashire cash = new cashire();


        // Enter number Of Items
        System.out.print("Enter Number Items : ");
        cash.iterations = cash.sc.nextInt();

        //size Of Array must be Equal number Of Items
        cash.numbers = new int[cash.iterations];
        cash.getPriceOfItems(cash.iterations);

        //Sum Price Of Items
        System.out.println("Total Of Price = "+sumArray(cash.numbers)+" $");

        //print array of Items
        printArray(cash.numbers);
    }

    void getPriceOfItems(int iterations){
        for (int i = 0; i < iterations; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();   // get value from user
        }
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

}
