package newStart.daytwo;

import java.util.Scanner;

public class GreetUser {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }
    static String getUserName(){
        System.out.print("Enter Your Name : ");
        return sc.nextLine();
    }
    static void greetUser(String name){
        System.out.println("Hello MR."+"'"+name+"'");
    }
}
