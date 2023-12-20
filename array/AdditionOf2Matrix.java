package com.array;

import java.util.Scanner;
// Addition of two matrix 
public class AdditionOf2Matrix {

	public static void main(String[] args) {
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
		for(i=0;i<n;i++)                           // to add the first matrix data
		{	for(j=0;j<m;j++)
			{	a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the 2nd matrix element");
		for(i=0;i<n;i++)                       // to add the 2nd matrix data 
		{	for(j=0;j<m;j++)
			{	b[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)                      // to sum the two matrix 
		{	for(j=0;j<m;j++)
			{	c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(i=0;i<n;i++)                    // to print the sum of the two matrix  
		{	for(j=0;j<m;j++)
			{	System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
