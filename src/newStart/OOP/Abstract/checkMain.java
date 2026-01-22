package newStart.OOP.Abstract;

public class checkMain {
    public static void main(String[] args) {
        Shape shape = new Rectangle(20,20);
        System.out.println(shape.caluArea());
        shape.print(10);

        Product product = new Book();
        product.setPrice(20);
        System.out.println(product.getPrice());
    }
}
