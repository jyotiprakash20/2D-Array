///Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
//INITIAL array :
//58	24	13	15	63	9	8	81	1	78

//After spliting :
//58	24	13	15	63
//9	8	81	1	78
public class PQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {58,24,13,15,63,9,8,81,1,78};
int middlearray=array.length/2;

int[] firstHalf=new int[middlearray];
int[] secondHalf=new int[array.length-middlearray];

for(int i=0;i<middlearray;i++) {
	firstHalf[i] = array[i];
}
for(int i=middlearray;i<array.length;i++) {
	secondHalf[i-middlearray]=array[i];
}
System.out.print("First half: ");
printArray(firstHalf);

System.out.print("Second half: ");
printArray(secondHalf);
	}
	public static void printArray(int[]array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}

}
