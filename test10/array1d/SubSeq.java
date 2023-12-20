package com.test10.array1d;

import java.util.*;
class SubSeq
{public static void main(String[] args)
	{Scanner s = new Scanner(System.in);
	int n,i,j,sum,t=0,sum2=0,k,o=0,temp=0;
	boolean flage=false;
	
		System.out.println("enter the number of rows");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enter which sum u want");
		int rq=s.nextInt();
		for ( i=0;i<n ;i++ )
		{
			a[i]=s.nextInt();
		}
		for (i=0;i<n ;i++ )
		{
			sum=a[i];
			for (j=i+1;j<n-1 ;j++ )
			{
				sum=sum+a[j];
				 if (sum==rq)
				{ 
					break;
				}
				for (o=j+1;o<n ;o++ )
				{flage=false;
				sum2=sum-a[j]+a[o];
				if (sum2==rq)
				{flage=true;
				  t=j;
				  temp=a[o];
				  break;
					}
				}
                if (flage==true)
                {break;
                }
				}
				if (sum==rq)
				{
					for (k=i;k<=j ;k++ )
					{
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}
				else if (sum2==rq)
				{
					for (k=i;k<=j ;k++ )
					{
						if(k==t)
						{
						System.out.print(temp);
						continue;
						}
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}	
			}	
		}		
}
