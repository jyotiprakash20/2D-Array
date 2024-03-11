// Write a java programm that prints the maximum of each row and column in a 2D Array.
public class PQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{3,4,5},{9,3,4}};
		
		int rowLength= matrix.length;
		int colLength= matrix[0].length;
		
		for(int i=0;i<rowLength;i++) {
			int rowMax=matrix[i][0];
			for(int j=1;j<colLength;j++) {
				if(matrix[i][j]> rowMax) {
					rowMax=matrix[i][j];
				}
			}
			System.out.println("Row "+ (i+1)+ " max: "+ rowMax);
		}
		for(int j=0;j<colLength;j++) {
			int colMax=matrix[0][j];
			for(int i=1; i<rowLength;i++) {
				if(matrix[i][j]> colMax) {
					colMax=matrix[i][j];
				}
			}
			System.out.println("Column "+ (j+1)+ " max: "+ colMax);
		}
	}

}
