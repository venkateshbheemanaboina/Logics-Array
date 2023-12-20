package com.test10.array1d;

public class ImpSubSequence {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,5,4,3,2,3};
		int i,j,k,l,sum=0,sum1=0,sum2=0,count=0,n,m;
		n=a.length;
		m=15;
		for(i=0;i<n;i++)
		{	sum=a[i];sum1=0;sum2=0; // System.out.println(sum);
			for(j=i+1;j<n;j++)
			{	sum=sum+a[j]; //System.out.println(sum);
				if(sum==m)
				{	for(k=i;k<j;k++)
					{	if((a[k]+a[k+1])%2==0)
						{	count++;
							break;
						}
					}
					if(count>0)
					{	count=0;
						for(k=i;k<=j;k++)
						{	System.out.print(a[k]);
						}
						System.out.println();
					}
				}
				else if(sum>m)
				{	sum2=sum;
					sum2=sum2-a[j];
					for(l=j+1;l<n;l++)
					{	sum2=sum2+a[l];
						if(sum2==m)
						{	for(k=i;k<l;k++)
							{	if((a[k]+a[k+1])%2==0)
								{	count++;
									break;
								}
							}
							if(count>0)
							{	count=0;
								for(k=i;k<=l;k++)
								{	if(k==j)
										continue;
									System.out.print(a[k]);
								}
								System.out.println();
							}
						}
					}
				}	
				else //System.out.println(a[i]+" "+j);
				{	sum1=sum;
					sum1=sum1-a[j]; //System.out.println(j);
					for(l=j+1;l<n;l++)
					{	sum1=sum1+a[l];  // System.out.println(sum1+" "+a[l]);
						if(sum1==m) 
						{	for(k=i;k<l;k++)
							{	if((a[k]!=a[k+1])|| a[k]!=a[k-1])
								{	count++;// System.out.println("hi");
									break;
								}
							}
							if(count>0)
							{	count=0;
								for(k=i;k<=l;k++)
								{	if(k==j)
										continue;
									System.out.print(a[k]);
								}
								System.out.println();
							}
						}
					}
				}
			}
		}
	}
}
