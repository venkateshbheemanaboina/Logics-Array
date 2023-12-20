package com.array;
// find the maximum triple of the give array
import java.util.Scanner;

public class MamimumProductOfTriple {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j,k,n,max;
		System.out.println("Enter the array length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0]*a[1]*a[2];
		
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{	int p=a[i]*a[j]*a[k];
					if(p>max)
					{
						max=p;
					}
				}
			}
		}
		System.out.println("the maximum product of triples is..."+max);

	}

}
