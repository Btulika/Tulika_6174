// Reversal of array

import java.util.Arrays;

public final class array1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        reverseArray(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
// Approach using same array
//     static void reverseArray (int[]arr) {

//         int n = arr.length;
//         for(int i=0; i<n/2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n-1-i];
//             arr[n-i-1] = temp;
//         }
    
//     }

// Using Recursive Approach 
        static void reverseArray (int[]arr, int start, int end){
            if (start>end) return; //exit-point of recursive function
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(arr, start+1, end-1);
        }
}