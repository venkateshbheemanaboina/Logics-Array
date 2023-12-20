package com.test10.array1d;

public class ShiftEvenOdd {

	public static void main(String[] args) {
		int i,j,k = 0,temp;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	for(j=i;j<a.length;j++)
			{
				if(a[i]%2==0)
				{
					break;
				}
				else
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int b:a)
		{
			System.out.println(b);
		}
	}

}
