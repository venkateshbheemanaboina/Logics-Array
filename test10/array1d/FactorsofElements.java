package com.test10.array1d;

public class FactorsofElements {

	public static void main(String[] args) {
		int i,j,sum=0,count=0,fact;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	fact=1;
			for(j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
