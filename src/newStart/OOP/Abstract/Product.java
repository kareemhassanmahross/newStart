package newStart.OOP.Abstract;

public interface Product {

    String getName();

    void setName(String name);

    double getPrice();

    void setPrice(double price);

    String getColor();

    void setColor(String color);

    default boolean QRcode (String Image){
        return true;
    }
}
