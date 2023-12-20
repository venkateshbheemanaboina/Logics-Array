package com.test10.array1d;

public class StrongelEement {

	public static void main(String[] args) {
		int i,j,k,count=0,rem,num,strong;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	strong=0;
			for(j=a[i];j>0;j=j/10)
			{
				rem=j%10;num=1;
				for(k=rem;k>0;k--)
				{
					num=num*k;
				}
				strong=strong+num;
			}
			if(a[i]==strong)
			{
				System.out.println(strong);
			}
		}

	}

}
