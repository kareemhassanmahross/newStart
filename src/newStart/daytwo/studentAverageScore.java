package newStart.daytwo;

import java.util.Scanner;

public class studentAverageScore {
    public static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfCourses = 4;

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfCourses; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Score Of");
                double score = sc.nextDouble();
                total += score;
            }
            System.out.println("total Of course is "+(i+1)+": " +total);
            System.out.println("Avarage of Corses " + (i + 1) + ": " + total/numberOfCourses);
        }
    }
}
