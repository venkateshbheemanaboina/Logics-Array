package com.test10.array1d;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ,j,n;
		System.out.println(" enter the length of array");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					//a[j]=a[j+1];
					//n--;
					//j=j-1;
					
					for(int k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					n--;
					j--;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
