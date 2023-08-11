//Move all the negative elements to one side of the array 

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        int arr[] = {-6, 5,2,-7,-10};
        int left = 0, right =arr.length-1;
        while(left<right){
            while(arr[left]<0)left++; //left ptr
            while(arr[right]>0)right--; //right ptr

            //break the loop to ensure they don't cross each other
            if(left>=right) break;

            //swap
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
}
