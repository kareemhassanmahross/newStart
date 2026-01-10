package newStart.OOP.constractors;

public class Month {
    public static int getMonth(String monthNumber){
         switch (monthNumber){
             case "JAN" : return 1;
             case "FEB" : return 2;
             case "MAR" : return 3;
             case "APR" : return 4;
             case "MAY" : return 5;
             case "JUN" : return 6;
             case "JUL" : return 7;
             case "AUG" : return 8;
             case "SEP" : return 9;
             case "OCT" : return 10;
             case "NOV" : return 11;
             case "DEC" : return 12;
             default:return -1 ;
         }
    }
    public static String getMonth(int monthNumber){
        switch (monthNumber){
            case 1 : return "JAN";
            case 2 : return "FEB";
            case 3 : return "MAR";
            case 4 : return "APR";
            case 5 : return "MAY";
            case 6 : return "JUN";
            case 7 : return "JUL";
            case 8 : return "AUG";
            case 9 : return "SEP";
            case 10: return "OCT";
            case 11: return "NOV";
            case 12: return "DEC";
            default:return "Undefine" ;
        }
    }
}
