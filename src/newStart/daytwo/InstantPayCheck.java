package newStart.daytwo;

import java.util.Scanner;

public class InstantPayCheck {
    static final double requierdSalary = 20000;
    static final double requiredScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      double salary = getEmployeeSalary();
      double score = getEmployeeScore();
      boolean qulified = isQualified( salary , score);
      notifiyUser(qulified);
    }

    static double getEmployeeSalary(){
        System.out.print("Enter Your Salary = ");
        return sc.nextDouble();
    }

    static double getEmployeeScore(){
        System.out.print("Enter Your Credit Score = ");
        return sc.nextDouble();
    }

    static boolean isQualified(double salary ,double score){
        if(salary>requierdSalary && score>requiredScore) {
            return true;
        }else {
            return false;
        }
    }

    static void notifiyUser(boolean qulified){
        if(qulified){
            System.out.println("Congratulation , you are qualified for the loan");
        }else {
            System.out.println("Sorry , you are not Qualifaied");
        }
    }
}
