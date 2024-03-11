//Write a program to Find Transposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,
//Matrix
//a11    a12    a13
//a21    a22    a23
//Transposed Matrix
//a11    a21
//a12    a22
//a13    a23
public class PQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[][] matrix = {
		            {1, 4, 9},
		            {11, 4, 3},
		            {2, 2, 3}
		        };

		        // Find the transpose of the matrix
		        int[][] transpose = new int[matrix[0].length][matrix.length];
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                transpose[j][i] = matrix[i][j];
		            }
		        }

		        // Print out the transposed matrix
		        System.out.println("Original Matrix:");
		        printMatrix(matrix);
		        System.out.println("\nTransposed Matrix:");
		        printMatrix(transpose);
		    }

		    // Print out the contents of a matrix
		    public static void printMatrix(int[][] matrix) {
		        for (int[] row : matrix) {
		            for (int num : row) {
		                System.out.printf("%3d", num);
		            }
		            System.out.println();
		        }
		    }
		}
	


