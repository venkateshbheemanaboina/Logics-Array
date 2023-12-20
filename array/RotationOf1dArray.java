package com.array;

import java.util.Scanner;

public class RotationOf1dArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,r,n;
		System.out.println("Enter the array length ");
		n=sc.nextInt();
		int a[]=new int [n];
		
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{	a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the no rotations");
		r=sc.nextInt();
		
		for(i=1;i<=r;i++)
		{	int temp=a[0];  
			for(j=0;j<n-1;j++)
			{	a[j]=a[j+1];
			} a[n-1]=temp;
		}
		
		for(i=0;i<n;i++)
		{	System.out.print(a[i]);
		}
		
	}

}
