package com.test10.array1d;

import java.util.Scanner;

public class MssingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,temp,n;
		System.out.println("Enter the array length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int last=a[0];
		for(i=0;i<a.length;i++)
		{
			if(last<a[i])
			{
				last=a[i];
			}
		}
		for(i=1;i<last;i++)
		{   int count=0;
			for(j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}

