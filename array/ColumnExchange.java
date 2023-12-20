package com.array;
//exchange the two columns using temp variable by using swap 
import java.util.Scanner;

public class ColumnExchange {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,col1,col2,temp;
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
		
		System.out.println("Enter the col1");
		col1=sc.nextInt();
		System.out.println("Enter the col2");
		col2=sc.nextInt();
		
		for(i=0;i<n;i++)
		{	temp=a[i][col1];
			a[i][col1]=a[i][col2];		
			a[i][col2]=temp;	
		}
		
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
