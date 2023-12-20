package com.array;
// row sorting using the sorting of 1-d array
import java.util.Scanner;

public class RowSorting {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,temp,k,large;
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
			{	for(k=j;k<n;k++)
				{	if(a[i][j]>a[i][k])
					{	temp = a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=temp;
					}
				}
			}
		}
		
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
	}
}
