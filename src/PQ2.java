//Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
//Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18

public class PQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] nums= {{1,4,9},{11,4,3},{2,2,3}};
int sum=0;
	for(int num : nums[1]) {
		sum+=num;
	}
System.out.println("The sum of the 2nd row of the array is "+ sum);
	}

}
