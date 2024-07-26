package practice;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n=sc.nextInt();
		System.out.println("Enter Array Elements : ");
		for(int i=1;i<=n;i++)
		{
			array[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n;i++)
			{
				if(i==j)
				{
					i++;
				}
				sum=sum+array[i];
			}
			System.out.print(sum+" ");
			sum=0;
		}
	}

}
