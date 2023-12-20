package searching.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,temp,min;
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		// normal sorting
		for(i=0;i<n;i++)
		{	for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			for(int p=0;p<n;p++)
				System.out.print(a[p]+" ");	
			System.out.println("");
		}
		// selection sort  
		/*for(i=0;i<n-1;i++)
		{
			min=a[i];
			int pos=i;
			for(j=i+1;j<n;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
		}*/
		
		//for(i=0;i<n;i++)
		//	System.out.println(a[i]+" ");

	}

}
