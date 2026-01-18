package newStart.OOP.Stringss;

public class TestProcessor {
    public static void main(String[] args) {
//      countWords("I Love Route Academy and Java");
//      reveseString("Kareem");
      int [][] arr = new int[3][4];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        for(int i=0 ;i< arr.length ; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
    public static void countWords(String text){
        String [] words = text.split(" ");
        String massage = String.format("Number Of Words is %d",words.length);
        System.out.println(massage);
//        System.out.println("Number Of Words is "+ words.length);
        for (String word:words){
            System.out.println(word);
        }
    }
    public static void reveseString(String text){
        String reversSting = "";
        for(int i=text.length()-1 ; i>=0 ; i--){
            reversSting = reversSting+text.charAt(i);
//            System.out.print(text.charAt(i));
        }
        System.out.println(reversSting);
    }

}
