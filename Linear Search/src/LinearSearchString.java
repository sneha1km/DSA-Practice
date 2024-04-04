import java.util.Scanner;

public class LinearSearchString {
   static boolean Search(char n, String string) {
	   if(string.length()==0) {
		   return false;
	   }
	   for(int i=0;i<string.length();i++) {
		   if(string.charAt(i)==n) {
			   return true;
		   }
	   }
	   return false;
   }
   
   static boolean SearchInRange(char n, String string, int start, int end) {
	   String str1="";
	   for(int i=start;i<=end;i++) {
		   str1+=string.charAt(i);
	   }
	   
	  return Search(n, str1);
   }

	public static void main(String[] args) {
		System.out.print("Enter the charchter to be searched ");
		String str="hello world";
		Scanner cs =new Scanner(System.in);
		
		char n=cs.next().charAt(0);
		System.out.println(Search(n, str));
		System.out.print("Enter start and end range value ");
		int start=cs.nextInt();
		int end=cs.nextInt();
		System.out.println(SearchInRange(n, str, start, end));
		


	}

}
