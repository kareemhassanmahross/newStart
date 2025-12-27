package newStart.daytwo;

public class BreakVsContainue {
    public static void main(String[] args) {
        for (int i =1 ; i <= 10 ; i++ ){

            if(i == 5 || i == 2 || i==7){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
