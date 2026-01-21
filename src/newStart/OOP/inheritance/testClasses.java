package newStart.OOP.inheritance;

import newStart.OOP.Rectangle;

public class testClasses {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("this Primeter Rectangle "+rectangle.culculatePerimeter());
        Squer sq = new Squer();
        sq.setLength(20);
        System.out.println("this perimter Squer "+ sq.culculatePerimeter());
    }
}
