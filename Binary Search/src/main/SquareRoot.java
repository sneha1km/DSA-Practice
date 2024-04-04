package main;

public class SquareRoot {
	static int squareRoot(int x) {
		int start=1, end=x;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(mid*mid<x){
               start=mid+1;
           }
           else if(mid*mid==x){
               return mid;
           }
           else{
             end=mid-1;
               
           }
        }
        return end;
		
	}

	public static void main(String[] args) {
		int num=8;
		System.out.println("check");
		System.out.println(squareRoot(num));
		

	}

}
