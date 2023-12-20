package com.array;
// finding the duplicate rows number
import java.util.Scanner;

public class DuplicateRows {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no of col");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int i,j,k,count;
		System.out.println("Enter the array elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<row-1;i++)
		{	
			for(j=i+1;j<row;j++)
			{	count=0;
				for(k=0;k<col;k++)
				{
					if(a[i][k]==a[j][k])
					{
						count++;
					}
				}
				if(count==col)
				{
					System.out.println(j+1);
				}
			}
			
		}

	}

}
