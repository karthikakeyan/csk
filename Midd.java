import java.util.*;
class Midd{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int N=sc.nextInt();
    int summ=0;
    int[][] arr=new int[N][N];
    System.out.println("enter the array elements: ");
    for(int i=0;i<N;i++){
    	for(int j=0;j<N;j++){
    		arr[i][j]=sc.nextInt();
    		if(i==j){
    			summ=summ+arr[i][j];
    		}
    	}
    }
    System.out.print(summ);
  }
}
