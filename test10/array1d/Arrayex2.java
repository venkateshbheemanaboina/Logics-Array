package com.test10.array1d;

public class Arrayex2 {

	public static void main(String[] args) {
		int i,j,sum=0;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float avg = sum/a.length;
		System.out.println(avg);
	}

}
