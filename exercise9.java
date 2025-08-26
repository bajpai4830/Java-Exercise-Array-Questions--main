/*1. Create an array {1, 2, 3, 4, 5}. 
2. Write a method to reverse it in-place. 
3. Print original and reversed arrays. */
public class exercise9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
