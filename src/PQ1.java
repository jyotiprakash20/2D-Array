//Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
//Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18

public class PQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] array= {{4, 7,8},{8,8,7}};
 int count=0;
 	for(int i=0;i< array.length;i++) {
 		for(int j=0;j<array[i].length;j++) {
 			if(array[i][j]==7) {
 				count++;
 				}
 			}
 	}
 	System.out.println("The numbers of 7's in the 2D array is "+count);
	}

}
