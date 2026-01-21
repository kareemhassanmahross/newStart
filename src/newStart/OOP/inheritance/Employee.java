package newStart.OOP.inheritance;

public class Employee extends Person{
    private String Title;
    private String SSID;
    private String image;
    public Employee(){
        super("Kareem");
        System.out.println("I am defalut Employee constractor");
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
