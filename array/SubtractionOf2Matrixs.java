package com.array;

import java.util.Scanner;
//Subtraction 
public class SubtractionOf2Matrixs {
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int n,m,i,j;
	
	System.out.println("Enter the length of row");
	n=sc.nextInt();
	System.out.println("Enter the length of column");
	m=sc.nextInt();
	
	int a[][]=new int [n][m];
	int b[][]=new int [n][m];
	int c[][]=new int [n][m];
	
	System.out.println("enter the 1st matrix elements"); 
	for(i=0;i<n;i++)
	{	for(j=0;j<m;j++)
		{	a[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter the 2nd matrix element");
	for(i=0;i<n;i++)
	{	for(j=0;j<m;j++)
		{	b[i][j]=sc.nextInt();
		}
	}
	
	for(i=0;i<n;i++)
	{	for(j=0;j<m;j++)
		{	c[i][j]=a[i][j]-b[i][j];
		}
	}
	
	for(i=0;i<n;i++)
	{	for(j=0;j<m;j++)
		{	System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
