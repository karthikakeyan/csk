import java.util.Scanner;


public class Summ{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int su=0;
		int digit=0;
		int count=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			count++;
		
		for(int i=1;i<=count;i++)
		{
			su=digit+su;
			
		}
		}
		System.out.println(su);
	}

}
