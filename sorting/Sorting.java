package searching.sorting;
//bubble sorting 
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter the length of array");
		n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter the attay elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int p=0;p<n;p++)
			{
				System.out.print(a[p]+" ");
			}
			System.out.println(" ");
		}
	}

}
