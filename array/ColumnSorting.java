package com.array;

import java.util.Scanner;

public class ColumnSorting {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int n,m,i,j,temp,k;
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
			
			for (i=0;i<m;i++)                 // 0
			{
				for(j=0;j<n;j++)                 //0.0=1 
				{
					for(k=j;k<n;k++)            //1
					{
						if(a[j][i]>a[k][i])       //1>6,1>2    6>4
						{
							temp=a[j][i];
							a[j][i]=a[k][i];
							a[k][i]=temp;
						}
					}
				}
			}
			
			/*for(j=0;j<m;j++)   // 
			{
				for(i=0;i<n;i++)
				{
					for(k=i+1;k<n;k++)
					{	if(a[i][j]>a[k][j])
						{
							temp=a[i][j];
							a[i][j]=a[k][j];
							a[k][j]=temp;
						}
					}
				}
			}*/
			
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
}
