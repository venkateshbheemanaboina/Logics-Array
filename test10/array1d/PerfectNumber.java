package com.test10.array1d;

public class PerfectNumber {

	public static void main(String[] args) {
		int i,j,k,count=0,rem,num,perfect;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	perfect=0;
			for(j=1;j<a[i];j++)
			{
				if(a[i]%j==0) 
				{
					perfect=perfect+j;
				}
			}
			if(a[i]==perfect)
			{
				System.out.println(perfect);
			}
		}

	}

}
