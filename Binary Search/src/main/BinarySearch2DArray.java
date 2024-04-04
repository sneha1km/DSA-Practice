package main;
//do binary search in 2D array where each row and column are sorted
public class BinarySearch2DArray {
     static int Search(int[][] array, int target) {
    	 int row=0, column=array.length-1;
    	 while(row<array.length && column>-1) {
    		 if(array[row][column]==target)
    		 {
    			 return array[row][column];
    		 }
    		 else if(array[row][column]<target) {
    			row++;
    		 }
    		 else {
    			 column--;
    		 }
    	 }
    	 return -1;

    	 
     }
	public static void main(String[] args) {
		int [][] array= 
			{   {10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
					
					
			};
		System.out.println(Search(array, 29));
		
	}

}
