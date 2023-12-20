package com.array;

import java.util.Scanner;

public class RsumMax {

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int rsum=0,n,m,i,j,max=0;
			System.out.println("Enter the length of row");
			n=sc.nextInt();
			System.out.println("Enter the length of column");
			m=sc.nextInt();
			
			int a[][]=new int [n][m];
			
			System.out.println("enter the array elements"); 
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<n;i++)
			{	rsum=0;
				for(j=0;j<n;j++)
				{
					rsum=rsum+a[i][j];
				}
				if(rsum>max)
				{
					max=rsum;
				}
			}
			System.out.println(max);

		}
	}

