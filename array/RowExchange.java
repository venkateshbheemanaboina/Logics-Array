package com.array;
//exchange the two rows using temp variable by using swap 
import java.util.Scanner;

public class RowExchange {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,row1,row2,temp;
		System.out.println("Enter the length of row");
		n=sc.nextInt();
		System.out.println("Enter the length of column");
		m=sc.nextInt();
		
		int a[][]=new int [n][m];                         //2d array declaration 
		
		System.out.println("enter the array elements"); 
		for(i=0;i<n;i++)                                // to take the inputs from the user
		{	for(j=0;j<m;j++)
			{	a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the row1");
		row1=sc.nextInt();                               // to take  the inputs from user witch row to exchange 
		System.out.println("Enter the row2");
		row2=sc.nextInt();
		
		for(i=0;i<n;i++)
		{	temp=a[row1][i];          // its for exchange the rows 
			a[row1][i]=a[row2][i];		
			a[row2][i]=temp;	
		}
		
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{                                       // for printing the output
				System.out.print(a[i][j]+" ");
			}
		System.out.println();               // to go next line 
		}
		
	}
}
