import java.util.Scanner;


public class n{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str=sc.nextLine();
		System.out.println("Enter the string 2: ");
		String str1=sc.nextLine();
		System.out.println("No.of times the first string to repeat: ");
		int n=sc.nextInt();
		System.out.println("No.of times the second string to repeat: ");
		int n1=sc.nextInt();
		String r1=" ";
		String r2=" ";
		for(int i=1;i<=n;i++)
		{
		 r1=r1+str;
		}
		for(int i=1;i<=n1;i++)
		{
		 r2=r2+str1;
		}
		System.out.println(r1+r2);
	}

}
