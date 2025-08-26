import java.util.*;
public class exercise6 {
    public static void main(String[] args) {
        int[] arr = {7,2,9,4,1};
        // Arrays.parallelSort(arr);
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
    }
}
