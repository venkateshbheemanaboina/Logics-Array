package com.array;
import java.util.Scanner;
// The given matrix is Daignonal or not 
public class DiognalMatrix {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int n,m,i,j,count=0,count1=0;
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
				{	if((i==j && a[i][j]!=0))
					{
						count++;
					}
					if((i<j && a[i][j]==0) || (i>j && a[i][j]==0))      //i!=j  && a[i][j]==0
					{
						count1++;
					}
				}
			}
		if(count==n && count1==(n*m)-n )
		{	System.out.println("the given matrixis diognla");
		}	
		else 
		{	System.out.println("the given matrix is not diognla");
		}
	}
}
