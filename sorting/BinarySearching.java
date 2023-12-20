package searching.sorting;

import java.util.Scanner;

public class BinarySearching {
	static void sort(int a[],int n)
	{	int i,j,temp;
		
		for(i=0;i<n;i++)
		{	for(j=i+1;j<n;j++)
			{	if(a[i]>a[j])
				{	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	static void binary_search(int a[],int n,int ke)
	{
		int i,low,mid=0,high,flag=0;
		
		low=0;
		high=n-1;
		
		for(i=0;i<n;i++)
		{
			mid=(low+high)/2;
			if(ke==a[mid])
			{
				flag=1;
				break;
			}
			if(ke>a[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
		}
		if(flag==1)
			System.out.println("the search element is found");
		else
			System.out.println("search element is not found");
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,i,keyelement;
		System.out.println("enter the array length");
		n=sc.nextInt();
		int a[]=new int [n];
		
		System.out.println("Enter the array elements.. ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the keyelement need to be searched..");
		keyelement=sc.nextInt();
		
		sort(a,n);
		binary_search(a,n,keyelement);
	}

}
