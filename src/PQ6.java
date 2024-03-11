//Write a java program to print first and last row of an array.
public class PQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array= {{2,3,4},{1,9,8},{2,7,10}};

for(int i=0;i<array[0].length;i++) {
	System.out.print(array[0][i] +" ");
}
System.out.println();

int lastRowindex=array.length-1;
for(int i=0;i<array[lastRowindex].length;i++) {
	System.out.print(array[lastRowindex][i]+ " ");
}
System.out.println();
	}

}
