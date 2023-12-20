package com.array;

import java.util.Scanner;
//matrix multiplication
public class MultiplicationOf2Arrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r1,r2,c1,c2,i,j,k;
		
		System.out.println("Enter the length of row of 1st matrix ");
		r1=sc.nextInt();
		System.out.println("Enter the length of column 1st matrix ");
		c1=sc.nextInt();
		
		System.out.println("Enter the length of row 2nd matrix ");
		r2=sc.nextInt();
		System.out.println("Enter the length of column 2d matrix ");
		c2=sc.nextInt();
		
		if(c1==r2)
		{
			int a[][]=new int [r1][c1];
			int b[][]=new int [r2][c2];
			int c[][]=new int [r1][c2];
			
			System.out.println("enter the 1st matrix elements"); 
			for(i=0;i<r1;i++)
			{	for(j=0;j<c1;j++)
				{	a[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter the 2nd matrix element");
			for(i=0;i<r2;i++)
			{	for(j=0;j<c2;j++)
				{	b[i][j]=sc.nextInt();
				}
			}
			
			for(i=0;i<r1;i++)
			{	for(j=0;j<c2;j++)
				{	c[i][j]=0;
					for(k=0;k<r2;k++)
					{	c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			for(i=0;i<r1;i++)
			{	for(j=0;j<c2;j++)
				{	System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("matrix multiplication is not possible");
		}

	}

}
