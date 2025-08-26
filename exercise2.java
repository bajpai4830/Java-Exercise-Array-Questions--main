/*
Exercise 2: Static vs Dynamic Initialization 
Demonstrating array initialization styles. 
Task 
1. Create an integer array of size 5 using dynamic allocation and fill it with squares of 
indices. 
2. Create another integer array using static initialization: {10, 20, 30, 40, 50}. 
3. Print both arrays using Arrays.toString(). 
*/
import java.util.Arrays;

public class exercise2 {
    public static void main(String[] args) {
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * i; 
        }
        int[] staticArray = {10, 20, 30, 40, 50}; 
        System.out.println("Dynamic :");
        System.out.println(Arrays.toString(dynamicArray));
        System.out.println("\nStatic:");
        System.out.println(Arrays.toString(staticArray));
    }
}