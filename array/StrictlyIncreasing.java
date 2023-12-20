package com.array;

import java.util.Scanner;

public class StrictlyIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,count=0,i,j,k;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{	for(j=i+1;j<n-1;j++)
			{	if(a[i]>a[j])
				{	if(a[j]>a[j+1])
					{
						int temp=a[i];
						a[i]=a[j+1];
						a[j+1]=temp;
						count=2;;
					}
					else 
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						count++;
					}
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println("count.."+count);
	}

}
