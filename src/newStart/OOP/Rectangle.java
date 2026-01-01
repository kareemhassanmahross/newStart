package newStart.OOP;

public class Rectangle {
   private double length ;
   private double width ;

   public void setLength(double length){
       this.length = length;
   }
   public double getLength(){
       return length;
   }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth(){
       return width;
    }

    public double culculateArea(){
       return length * width;
   }
    public double culculatePerimeter(){
        return length * 2 +width*2;
    }

}
