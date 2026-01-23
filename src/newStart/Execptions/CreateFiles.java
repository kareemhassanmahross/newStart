package newStart.Execptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateFiles {
    public static void main(String[] args) {
//       createFile();
        try {
            createFileThowExeptions();
        }catch (IOException e){
            System.out.println("i am didnt found path");
            e.printStackTrace();
        }
        System.out.println("Hello i am after Exeptions");


//        numbersExecptionHandling();
    }
    public static void createFileThowExeptions() throws IOException {
        File file = new File("k;lasjd;flk/asldjfhlakjs.txt");
        file.createNewFile();
    }
    public static void createFile(){
        File file = new File("resource/New.txt");
        try{
           file.createNewFile();
        }catch (IOException e){
            System.out.println("the Path Doesn't Exist ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello From After execption");
    }
    public static void numbersExecptionHandling(){
        File file = new File("resource/New.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNext()){
                double num = sc.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
            e.printStackTrace();
        }catch (InputMismatchException e){
//            e.printStackTrace();
            System.out.println("you must add successful data");
        }
        finally {
            sc.close();
        }
        System.out.println("I am after Execption");
    }
}
