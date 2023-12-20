package com.array;

import java.util.Scanner;
//Sparse matrix
//in a matrix the number of zeros is more then the off of size of matrix then we call that matrix as 
//Sparse matrix
public class SparceMAtrix {
	public static void main(String[] args) 
	{	Scanner sc =new Scanner(System.in);
		int n,m,i,j,count=0;
		
		System.out.println("Enter the length of row");
		n=sc.nextInt();
		System.out.println("Enter the length of column");
		m=sc.nextInt();
		
		int a[][]=new int [n][m];
		
		System.out.println("enter the array elements"); 
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	if(a[i][j]==0)
				{	count++;
				}
			}
		}
		
		if(count>(n*m)/2)
		{	System.out.println("the given matrix is a Sparse matrix");
		}
		else
		{	System.out.println("Not a Sparse matrix");
		}
	}
}
