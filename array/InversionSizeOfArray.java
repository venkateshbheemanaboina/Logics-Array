package com.array;
// the values in decreasing order and their index should be in increasing order
import java.util.Scanner;

public class InversionSizeOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,j,k,n,count=0;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(a[i]>a[j]&&a[j]>a[k] && i<j && j<k)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
