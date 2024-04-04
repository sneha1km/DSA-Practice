package main;

import java.util.Arrays;

public class  TwoSum167 {
//	 static public int[] binarySearch(int [] numbers, int target, int index){
//		 int start=index+1, end=numbers.length-1;
//	        while(start<=end){
//	            int mid=start+(end-start)/2;
//	            if(target-numbers[index]==numbers[mid]){
//	            	return new int[]{index+1,mid+1};
//	            }
//	            else if(target-numbers[0]<numbers[mid]){
//	                end=mid-1;
//	            }
//	            else if(target-numbers[0]>numbers[mid]){
//	                start=mid+1;
//	            }
//	            
//	        }
//	        return binarySearch(numbers, target, index+1);
//	       
//	    }
	static public int[] twoSum(int[] numbers, int target) {
//		int index=0;
//		int[] check= {0,0};
//		return binarySearch(numbers, target, index);
		int [] result= {0,0};
		int start=0, end=numbers.length-1;
		while(start<end) {
			
			int sum=numbers[start]+numbers[end];
			if(sum==target) {
				result[0]=start+1;
				result[1]=end+1;
				return result;
				
			}
			else if(sum<target) {
				start++;
			}
			else {
				end--;
			}
				
		}
		
       return result;
		
	    }

	public static void main(String[] args) {
		int [] array= {2,3,4};
		int target=6;
	     System.out.println(Arrays.toString(twoSum(array, target)));
		

	}

}
