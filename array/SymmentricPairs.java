package com.array;
// mirror pairs  ex 10 5 = 5 10     this code only for two * n elements
import java.util.Scanner;

public class SymmentricPairs {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j,n,m;
		System.out.println("Enter number of rows");
		n=sc.nextInt();
		System.out.println("Enter number of columns");
		m=sc.nextInt();
		
		
		int a[][]=new int [n][m];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i][0]==a[j][1]&&a[i][1]==a[j][0])
				{
					System.out.println(a[i][0]+" "+a[i][1]);
				}
			}
		}
	}

}
