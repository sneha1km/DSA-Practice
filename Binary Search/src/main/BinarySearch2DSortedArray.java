package main;
//binary serach in 2D sorted array
// arr[][]=
//	{
//		1,2,3,4
//	    5,6,7,8
//	    9,10,11,12
//	}
public class BinarySearch2DSortedArray {
	static boolean Search(int[][] arr, int target) {
		int n=arr.length, m=arr[0].length;
		int low=0, high=n*m-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			int row=mid/m;
			int column=mid%m;
			if(arr[row][column]==target) {
				return true;
			}
			else if(arr[row][column]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array= 
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
				
		};
		
		int target=1111;
	System.out.println(Search(array, target));

	}

}
