package m;

import java.util.Scanner;
 public class Case {
 public static void main(String[] args) {
	 int i,j;
	 Scanner sc=new Scanner(System.in);
	 String aa[]=sc.nextLine().split(" ");
	 
	  
	 for(i=0;i<aa.length;i++)
	 {
		 for(j=aa[i].length()-1;j>=0;j--)
		 {
			 if(j==0)
				 System.out.print(a[i].toLowerCase().charAt(j));
			 else if(j==(aa[i].length()-1))
					 System.out.print(a[i].toUpperCase().charAt(j));
			 else
				 System.out.print(aa[i].charAt(j));
	
		 }
		 System.out.print(" ");
	 }
		 
		 
	 }
	 
} 
