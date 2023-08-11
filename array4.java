//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {
        int zero=0, one=0, two=0;
        int arr[] ={0,1,2,0,0,0,1,1,1,1,1,2,0};

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == 0) zero++;
            if (arr[i] == 1) one++;
            if (arr[i] == 2) two++;

        }

        for(int i = 0; i < zero; i++) arr[i]=0;
        for(int i = zero; i < one+zero; i++) arr[i]=1;
        for(int i = one+zero; i < arr.length; i++) arr[i]=2;
        System.out.println(Arrays.toString(arr));
    }
}
