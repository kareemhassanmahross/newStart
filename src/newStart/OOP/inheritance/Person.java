package newStart.OOP.inheritance;

public class Person {
  private String name ;
  private  int ID ;
  private String Address ;
   public Person (){

   }
   public Person(String name){
       System.out.println("i am default Person constractor pra");
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
