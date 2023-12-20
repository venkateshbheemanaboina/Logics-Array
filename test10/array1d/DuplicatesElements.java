package com.test10.array1d;

public class DuplicatesElements {

	public static void main(String[] args) {
		int i,j,count=0;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int b=a.length;
		for(i=0;i<b;i++)
		{	count=0;
			for(j=i+1;j<b;j++)
			{
				if(a[i]==a[j])
				{	count++;
					a[j]=a[j+1];
					b--;
				}
			}
			if(count>0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
