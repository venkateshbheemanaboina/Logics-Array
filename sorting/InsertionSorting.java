package searching.sorting;
// insert sorting 
import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter the array length..");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter the array elemnts...");
		for(i=0;i<n;i++)
		{	a[i]=sc.nextInt();
		}
		
		for(i=1;i<n;i++)
		{	temp=a[i];
			j=i-1;
			while(j>=0&& a[j]>temp)
			{	a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
			for(int p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
	}
}
