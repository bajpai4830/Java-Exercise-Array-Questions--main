/*1. Create a 3x3 matrix. 
2. Fill it with numbers 1–9. 
3. Find the sum of the primary diagonal. 
4. Find the sum of the secondary diagonal. */
public class exercise10 {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    public int getPrimaryDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int getSecondaryDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][2 - i];
        }
        return sum;
    }
    public static void main(String[] args) {
        exercise10 ex = new exercise10();
        System.out.println("Primary Diagonal Sum: " + ex.getPrimaryDiagonalSum());
        System.out.println("Secondary Diagonal Sum: " + ex.getSecondaryDiagonalSum());
    }
}
