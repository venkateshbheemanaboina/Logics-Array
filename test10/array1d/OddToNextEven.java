package com.test10.array1d;

public class OddToNextEven {

	public static void main(String[] args) {
		int i,j;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	if(a[i]%2!=0)
			{
				a[i]=a[i]+1;
			}
			System.out.println(a[i]);
		}
	}
}
