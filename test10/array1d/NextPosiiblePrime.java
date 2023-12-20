package com.test10.array1d;

public class NextPosiiblePrime {

	public static void main(String[] args) {
		int i,j,k,count;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{
			for(j=a[i];   ;j++)
			{	count=0;
				for(k=2;k<a[i];k++)
				{
					if(j%k==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println(j);
					break;
				}
			}
		}
	}

}
