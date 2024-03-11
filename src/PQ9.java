//Declare and create a two-dimensional array of strings named colors. Put the colors (“red”, “yellow”, “blue”) in the first row, and the colors (“orange”, “green”, “purple”) in the second row. Then print every value in the array.

public class PQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] colours= new String[2][3];

colours[0][0]="red,";
colours[0][1]="yellow,";
colours[0][2]="blue";

colours[1][0]="orange,";
colours[1][1]="green,";
colours[1][2]="purple";

for(int i=0;i<colours.length;i++) {
	for(int j=0;j<colours[0].length;j++) {
		System.out.print(colours[i][j]+ " ");
	}
	System.out.println();
}
	}

}
