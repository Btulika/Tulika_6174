import java.util.Arrays;
//Find the "Kth" max and min element of an array 

public class array3 {
    static Pair getMinMax (int arr[], int n, int k) {
    Pair minmax = new Pair();
    Arrays.sort(arr);
    minmax.min = arr[k-1];
    minmax.max = arr[n-k];
    return minmax;
    }

    
        public static void main(String[] args) {
            int arr[] = {12, 5, 32, 45, 50, 36, 100};
            int n = arr.length;
            int k = 3;
            Pair minmax = getMinMax(arr, n, k);
            System.out.printf("Minimum element is %d", minmax.min);
            System.out.printf("Maximum element is %d", minmax.max);
        
    }

}
