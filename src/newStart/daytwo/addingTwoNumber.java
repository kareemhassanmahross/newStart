package newStart.daytwo;

import java.util.Scanner;

public class addingTwoNumber {
    Scanner sc = new Scanner(System.in);
   static addingTwoNumber addnumber = new addingTwoNumber();
    double numberOne;
    double numberTwo;
    public static void main(String[] args) {
        boolean again = false;
        do {
            addnumber.getNumbersFromUser();
           double sum =  addnumber.sumNumers(addnumber.numberOne,addnumber.numberTwo);
           double Multi =  addnumber.MultiNumers(addnumber.numberOne,addnumber.numberTwo);
            System.out.println("the Summetion is = " + sum);
            System.out.println("the Multiblay is = " + Multi);
            System.out.println("Need New Iteration : ");
            again = addnumber.sc .nextBoolean();
        }while (again);

    }
    double sumNumers(double num1 , double num2){
        return num1 + num2;
    }
    double MultiNumers(double num1 , double num2){
        return num1 * num2;
    }
    double getNumber(){
        System.out.print("Enter Your NumberOne : ");
        return sc.nextDouble();
    }
    void setNumber(double number){
        this.numberOne = number;
    }

    public double getNumberTwo() {
        System.out.print("Enter Your NumberTwo : ");
        return sc.nextDouble();
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
    void getNumbersFromUser(){
        addnumber.numberOne = addnumber.getNumber();
        addnumber.numberTwo = addnumber.getNumberTwo();
    }
}
