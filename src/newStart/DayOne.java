package newStart;

import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");

        System.out.println(startnew());
    }
    static int startnew(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age :");
        int x = sc.nextInt();
        if(x==1){
            return 1;
        }else {
            return -1;
        }
    }
}
