package newStart.daytwo;

import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Text : " );
        String text = sc.nextLine();
        boolean flage = false;
        int position = 0;
        for(int i = 0 ; i < text.length(); i++){
            char letter = text.charAt(i);
            if(letter == 'a' || letter == 'A'){
                flage = true;
                position = i+1;
                break;
            }
        }
        if(flage){
            System.out.println("I am Found this Letter A and Position is " + position);
        }else {
            System.out.println("Letter Not Found");
        }
    }
}
