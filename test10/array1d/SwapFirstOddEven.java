package com.test10.array1d;

public class SwapFirstOddEven {

	public static void main(String[] args) {
		int i,j,k = 0,temp;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				k=i;
				break;
			}
		}
		for(j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			{
				temp=a[j];
				a[j]=a[k];
				a[k]=temp;
				break;
			}			
		}
		for(int n:a)
		{
			System.out.println(n);
		}
	}
}
