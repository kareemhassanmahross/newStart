package newStart.OOP.Array;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55,66};
        int [] arr1 = {11,22,33,44,55,66};
        int number = binarySearch(arr1,66);
        System.out.println(number);

    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length ;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid+1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int [] sortArray(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    static void printArray(int [] newAr){
        for(int i = 0 ;i < newAr.length ; i++){
            System.out.println("number of index ["+i+"] = " +newAr[i]);
        }
    }
}
