import java.util.Scanner;
public class LinearSearchIntegerArray {
	static int Search(int num, int[] array) {
		if(array==null) {
			return -1;
			
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				return i; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.print("Enter the digit to be searched");
		int[] array= {};
		Scanner cs =new Scanner(System.in);
		int n=cs.nextInt();
		System.out.println(Search(n,array));

	}

}
