package main;

public class OrderAgnosticBinartSearch {

	static int agnosticSearch(int [] array, int num) {
		if(array[0]>array[array.length-1]) {
			return binarySearchDec(array,  num);
		}
		else {
			return binarySearchAce(array,  num);
			
		}
	}
	static int binarySearchDec(int arr[], int num) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<num) {
				end=mid-1;
			}
			else if(arr[mid]>num) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int binarySearchAce(int arr[], int num) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<num) {
				start=mid+1;
			}
			else if(arr[mid]>num) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	int [] array= {1,7,99,100,345};
	System.out.println(agnosticSearch(array, 7));
	}

}
