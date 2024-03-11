//Write a java programm that prints  the sum of each row and column  in a 2D Array.

public class PQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[][] matrix= {{3,4,5},{9,3,4}};

 int rowlength=matrix.length;
 int collength=matrix[0].length;
 
 for(int i=0; i<rowlength;i++) {
	 int rowSum=0;
	 for(int j=0;j<collength;j++) {
		 rowSum+=matrix[i][j];
	 }
	 System.out.println("Row "+ (i+1)+ " sum:"+ rowSum);
 }
 for(int j=0;j<collength;j++) {
	 int colSum=0;
	 for(int i=0;i<rowlength;i++) {
		colSum+=matrix[i][j]; 
	 }
	 System.out.println("Column "+ (j+1)+ " sum "+ colSum);
 }

}
	}


