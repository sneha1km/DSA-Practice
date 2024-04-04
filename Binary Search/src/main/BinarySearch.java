package main;

import java.util.Scanner;

public class BinarySearch {
	static boolean Search(int [] array, int num) {
		int start=0, end=array.length-1;
		return midSearch(array, num, start, end);
	
		
	}
	static boolean midSearch(int []array, int num, int start, int end) {
		int mid=(start+end)/2;
		while(start<=end) {
			if(array[mid]==num) {
				return true;
			}
			else if(array[mid]<num) {
				start=mid+1;
				 return midSearch(array, num, start, end);
			}
			else if (array[mid]>num) {
				end=mid-1;
				return midSearch(array, num, start, end);
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] arr={10,11,15,30,55,60};
		System.out.println("enter the no to be searched");
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		System.out.println(Search(arr, n)); 
	}

}
