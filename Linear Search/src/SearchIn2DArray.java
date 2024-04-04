import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
	static int [] Search(int n, int[][] array) {
		for(int row=0;row<array.length;row++) {
			for(int column=0;column<array[row].length;column++) {
				if(array[row][column]==n) {
					return new int[] {row,column};
				}
			}
		}
		return new int [] {-1,-1};
	
	}

	public static void main(String[] args) {
		System.out.print("Enter the  umber to be searched ");
		Scanner sc  =new Scanner(System.in);
		int num=sc.nextInt();
		int [][] array= {
				{1,6,77},
				{99,-5,39},
				{1,4,5}
			};
		System.out.println(Arrays.toString(Search(num, array)));
		}

	}


