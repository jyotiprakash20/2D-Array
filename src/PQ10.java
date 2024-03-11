//:-Print the number of rows in the given two-dimensional array, or the length of the outer array. Then print the number of columns, or the length of each inner array.

//Ex. The array { {“hello”,”there”,”world”},{“how”,”are”,”you”} } should print:

//Rows: 2

//Columns: 3
public class PQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[][] arr= {{"Hello", "there", "world"},{"how", "are", "you"}};
	        
	        int numRows=arr.length;
	        int numCols=arr[0].length;
	        
	        System.out.println("Rows: "+ numRows);
	        System.out.print("Columnbs: "+numCols);
	}

}
