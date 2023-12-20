package com.array;
// to find the product of the pair that equals to the given value or not
import java.util.Scanner;

public class ProductPair1dArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j,x,n,count=0;
		System.out.println("Enter the array length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the x value");
		x=sc.nextInt();
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]*a[j]==x)
				{
					count++;
				}
			}
		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
