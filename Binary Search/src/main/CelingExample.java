package main;

import java.util.Scanner;

public class CelingExample {
	static int SearchSelling(int target, int[] array) {
		int start=0, end=array.length-1, result=-1;
		
//		while(start<=end && result==-1) {
//			int mid=start+(end-start)/2;
//			if(array[mid]<target) {
//				start=mid+1;
//				
//			}
//			else if(array[mid]==target) {
//				result=array[mid];
//			}
//			
//			else if(array[mid]>target && array[mid-1]>target) {
//				end=mid-1;
//			}
//			else if(array[mid]>=target) {
//				result=array[mid];
//			}
//		}
//		System.out.println(result);
//		return result;
		
		while(start<=end ) {
			int mid =start+(end-start)/2;
			
			 if(array[mid]>target) {
				end=mid-1;
			}
			 else if(array[mid]<target) {
				start=mid+1;
			}
		
			else {
				return array[mid];
			}
		}
		return array[start];
		
	}

	public static void main(String[] args) {
//		System.out.println("Enter the target value");
//		Scanner sc=new Scanner(System.in);
//		int target=sc.nextInt();
		int target=15;
		int [] array= {2,3,5,9,14,16,18};
		System.out.println(SearchSelling(target, array));
		
		
	}

}
