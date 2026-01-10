package newStart.OOP.Array;

import java.util.Random;

public class LottaryTicketRedo {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int [] ticket = getRandomInArray();
        printArray(ticket);
    }

    public static int [] getRandomInArray(){
        int [] ticket = new int[LENGTH];

        Random random = new Random();
        int randomNumber ;
        for(int i = 0 ; i < ticket.length ; i++ ){
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1 ;
            }while (search(ticket,randomNumber));
            ticket[i]=randomNumber;
        }
        return ticket;
    }
    public static void printArray(int []ticket){
        for (int i =0;i<ticket.length;i++){
            System.out.println("index ["+i+"] = " + ticket[i]);
        }
    }
    public static boolean search(int [] ticket,int randomNumber){
        for (int number : ticket){
            if(number == randomNumber){
                return true;
            }
        }
        return false;
    }
}
