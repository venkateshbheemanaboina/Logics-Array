package com.test10.array1d;

public class PrimeElements {

	public static void main(String[] args) {
		int i,j,count=0;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	count=0;
			for(j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}
	}
}
