//Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

//Original Array:
//10 20 30
//40 50 60
//After changing the rows and columns of the said array:10 40
//20 50
//30 60

public class PQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array= {{10,20,30},
		        {40,50,60}};

int[][] transpose=new int[array[0].length][array.length];
for(int i=0;i<array.length;i++) {
	for(int j=0;j<array[0].length;j++) {
		transpose[j][i]=array[i][j];
	}
}
System.out.println("Original array");
printMatrix(array);
System.out.print("\nTranspose matrix");
printMatrix(transpose);
	}
	public static void printMatrix(int[][] array) {
		for(int[] row: array) {
			for(int num: row) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}

}
