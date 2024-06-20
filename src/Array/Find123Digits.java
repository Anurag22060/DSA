package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class Find123Digits {
    public static void main(String[] args) {
    int arr[] = {321, 123, 89, 32, 11};
    int n = arr.length;

    List<Integer> Solution = find123Digits(arr,n);

        System.out.println(Solution);


    }
    public static List<Integer> find123Digits(int[] arr, int n){

        List<Integer> digitsList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String numStr = String.valueOf(arr[i]);
            if (numStr.contains("1") && numStr.contains("2") && numStr.contains("3")) {
                digitsList.add(arr[i]);
            }
        }

        Collections.sort(digitsList);
        return digitsList;
    }


}
