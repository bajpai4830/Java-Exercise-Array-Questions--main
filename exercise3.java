/*
Exercise 3: Jagged Arrays 
Bruce shows arrays of arrays where rows can have different lengths. 
Task 
1. Create a jagged array with 3 rows. 
○ Row 1 → 2 elements 
○ Row 2 → 4 elements 
○ Row 3 → 3 elements 
2. Fill it with sequential numbers. 
3. Print it row by row. 
*/
public class exercise3 {
    public static void main(String[] args) {
        int[][] ja = new int[3][];
        ja[0] = new int[2];
        ja[1] = new int[4]; 
        ja[2] = new int[3]; 
        int n = 1;
        for (int i = 0; i < ja.length; i++) {      
            for (int j = 0; j < ja[i].length; j++) { 
                ja[i][j] = n;
                n++; 
            }
        }
        System.out.println("The contents are :");
        for (int i = 0; i < ja.length; i++) {     
            for (int j = 0; j < ja[i].length; j++) { 
                System.out.print(ja[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}