import java.util.Arrays;

public class BubbleSort {
	static int[] bubbleSort(int [] array) {
		int n=array.length-1, length=array.length-1;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				int temp=0;
				if(array[j]<array[j-1]) {
			
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					
					
				}
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array= {3,1,5,4,2};
		System.out.println(Arrays.toString(bubbleSort(array)));
		//int [] result=new int[](bubbleSort(array));
		// TODO Auto-generated method stub

	}

}
