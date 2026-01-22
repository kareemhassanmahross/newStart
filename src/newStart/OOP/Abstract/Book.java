package newStart.OOP.Abstract;

public class Book implements Product {
    private String name;
    private String color;
    private double price;
    private String Aother;
    private String Isban;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAother() {
        return Aother;
    }

    public void setAother(String aother) {
        Aother = aother;
    }

    public String getIsban() {
        return Isban;
    }

    public void setIsban(String isban) {
        Isban = isban;
    }
}
