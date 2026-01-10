package newStart.OOP.Array;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int [] arr = getGrades();
        printGrades(arr);
        System.out.println("the Avarage Of Grades is "+getAvarageOfgrades(arr));
        System.out.println("the Highest Of Grades is "+getHighestGrade(arr));
        System.out.println("the Lowest Of Grades is "+getLowestGrade(arr));
//        String name = "Kareem";
//        char newName = name.charAt(2);
//        int newName = name.codePointAt(1);
//        System.out.println(newName);

    }
    public static int [] getGrades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many grades you want to enter ? ");
        int [] arrOfGrades = new int[sc.nextInt()];
        for(int i=0 ; i<arrOfGrades.length ; i++){
            System.out.println("Enter grade " + (i+1));
            arrOfGrades[i] = sc.nextInt();
        }
        return arrOfGrades;
    }
    public static void printGrades(int [] arr){
        int i = 0;
        for(int grade:arr){
            System.out.println("grade ["+ (i+1) +"] = " + grade);
            i++;
        }
    }
    public static double getAvarageOfgrades(int [] arr){
        return (double) sumGrades(arr) /arr.length;
    }
    public static int sumGrades (int [] arr){
        int sum =0;
        for(int grade : arr){
            sum+=grade;
        }
        return sum;
    }
    public static int getHighestGrade(int [] arr){
       int highest = arr[0];
       for(int element:arr){
           if(element>highest){
               highest=element;
           }
       }
       return highest;
    }
    public static int getLowestGrade(int [] arr){
        int Lowest = arr[0];
        for(int element:arr){
            if(element<Lowest){
                Lowest=element;
            }
        }
        return Lowest;
    }
}
