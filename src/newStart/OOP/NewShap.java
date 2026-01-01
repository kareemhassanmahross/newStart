package newStart.OOP;

public class NewShap {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(200);
        room1.setWidth(30);
        System.out.println("The Area of Room One is : "+room1.culculateArea());
        System.out.println("The Perimeter Of Room One is : "+room1.culculatePerimeter());
        Rectangle room2 = new Rectangle();
        room2.setLength(50);
        room2.setWidth(50);
        System.out.println("The Area of Room Two is : "+room2.culculateArea());
        System.out.println("The Perimeter Of Room Two is : "+room2.culculatePerimeter());

    }
}
