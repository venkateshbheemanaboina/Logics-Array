package com.array;
// to find the common element in the given 2d array 
// the question is to find the common element which means the element should present in every row so i am comparing my 0th row with other rows 
import java.util.Scanner;

public class CommanElementINEachAray {

	public static void main(String[] args) {
		int i,j,k,count,com=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Entet no of rows");
		int row=sc.nextInt();
		
		System.out.println("Enter no of cloumns");
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<col;i++)
		{	count=0;  
			for(j=1;j<row;j++)
			{
				for(k=0;k<col;k++)
				{
					if(a[0][i]==a[j][k])
					{	com=a[0][i];
						count++;   
						break;
					}
				}
			} //System.out.println(count);
			if(count==row-1)
			{
				System.out.println(com);
			}
		}
	}

}


