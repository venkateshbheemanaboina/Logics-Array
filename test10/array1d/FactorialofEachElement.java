package com.test10.array1d;

public class FactorialofEachElement {

	public static void main(String[] args) {
		int i,j,sum=0,count=0,fact;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	fact=1;
			for(j=a[i];j>0;j--)
			{
				fact=fact*j;
			}
			System.out.println(fact);
		}
	}

}
