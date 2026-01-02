package newStart.OOP.constractors;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.getEmployeeData();
        LearnConstractor employee1 = new LearnConstractor(); // new object
        System.out.println("Email from default constractor "+ employee1.getEmail()); // email is null
    }
    public  LearnConstractor getEmployeeData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter your Email : ");
        String email = sc.nextLine();
        LearnConstractor employee1 = new LearnConstractor(id , name ,email);
        employee1.setId(id);
        employee1.setName(name);
        employee1.setEmail(email);
        return employee1;
    }
}
