package com.test10.array1d;

public class ElementsToBinary {

	public static void main(String[] args) {
		int i,j,rem,binary,base = 0;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int b=a.length;
		for(i=0;i<b;i++)
		{	base=1;binary=0;
			for(j=a[i];j>0;j=j/2)
			{
				rem=j%2;
				binary=binary+base*rem;
				base=base*10;
			}
			System.out.println(binary);
		}

	}

}
