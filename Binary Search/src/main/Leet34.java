package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leet34 {
    
	static int[] result(int[]  nums, int target) {
		//List <Integer> list=new ArrayList<>();
        int[] array={-1,-1};
        int start= searchRange(nums, target, true);
        int end=searchRange(nums, target, false);
        array[0]=start;
        array[1]=end;
        return array;
		
		
	}
	
	
	static int searchRange(int[] nums, int target,boolean isStart) {
        
        int start=0, end=nums.length-1, value=-1;
//        System.out.println("check");
        while(start<=end){
           int  mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target==nums[mid]  ){
              value=mid;
            	// list.add(mid);
              if(isStart) {
            	  end=mid-1;
              }
              else {
            	  start=mid+1;
              }
                
            }
            else{
                end=mid-1;
            }
        }
        return value;

	}
	public static void main(String[] args) {
		int target=8;
		int []array= {5,7,7,8,8,8,8,10};
		
		System.out.println(Arrays.toString(result(array, target)) ); 

	}

}
