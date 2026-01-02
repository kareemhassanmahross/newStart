package newStart.OOP;

import com.sun.net.httpserver.Request;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static void main(String[] args) {
        HomeAreaCalculatorRedo home = new HomeAreaCalculatorRedo();
        Rectangle room1 = home.getDimensions();
        Rectangle room2 = home.getDimensions();
        home.printRoomOne(room1);
        home.printRoomTwo(room2);
    }
    public Rectangle getDimensions(){
        Rectangle room = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length = ");
        double length = sc.nextDouble();
        System.out.print("Enter Width = ");
        double width = sc.nextDouble();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }
    void printRoomOne(Rectangle room1){
        double froom=room1.culculateArea();
        System.out.println("Area Of Room One is : "+froom);
    }
    void printRoomTwo(Rectangle room2){
        double Sroom=room2.culculateArea();
        System.out.println("Area Of Room One is : "  +Sroom);
    }
}
