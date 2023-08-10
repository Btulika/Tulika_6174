class Pair{
    public int min;
    public int max;
}
public class array2 {

    //Find the maximum and minimum element in an array
    //Using Sorting
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;

    //     Arrays.sort(arr);
    //     minmax.min = arr[0];
    //     minmax.max = arr[n-1];
    //     return minmax;
    // }
    // public static void main(String[] args) {
    //     int arr[] ={25,10,55,100,02,62,45};
    //     int m = arr.length;
    //     Pair minmax = getMinMax(arr, m);
    //     System.out.println("Minimum element is " + minmax.min);
    //     System.out.println(("Maximum element is " + minmax.max));
    // }

    //Using Linear Search
    if (n == 1){
        minmax.max = arr[0];
        minmax.min = arr[0];
        return minmax;
    }

    if (arr[0] >arr[1]) {
        minmax.max = arr[0];
        minmax.min = arr[1];
    } else {
        minmax.max = arr[1];
        minmax.min = arr[0];
    }

    for (i = 2; i < n; i++)
    {
        if (arr[i]<minmax.min) {
            minmax.min = arr[i];
        }
        else if (arr[i]>minmax.max){
            minmax.max = arr[i];
        }
    }

    return minmax;
}
    public static void main(String[] args) {
        int arr[] = {1000, 50, 555, 750, 3333};
        int n = arr.length;
        Pair minmax = getMinMax (arr, n);
        System.out.printf("Minimum element is %d", minmax.min);
        System.out.printf("Maximum element is %d", minmax.max);
    }

}
