package com.test10.array1d;

public class ArmsstrongElements {

	public static void main(String[] args) {
		int i,j,k,count=0,rem,num;
		int a[] = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(i=0;i<a.length;i++)
		{	count=0;
			for(j=a[i];j>0;j=j/10)
			{
				count++;
			}
			num=0;
			for(k=a[i];k>0;k=k/10) 
			{
				rem=k%10;
				num=num+ (int)Math.pow(rem, count);
			}
			if(num==a[i])
			{
				System.out.println(num);
			}
		}
	}
}
