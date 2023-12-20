package com.test10.array1d;

public class Imp2SubSequence {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,5,4,3,2,3};
		int i,j,k,l,m,sum=0,sum1=0,sum2=0;
		int n=a.length;
		m=15;
		for(i=0;i<n;i++)
		{	sum=a[i];      //2,
			if(sum==m)
			{
				System.out.println(a[i]);
			}
			else if(sum>m)
			{
				continue;
			} //ok
			else
			{	
				for(j=i+1;j<n;j++)    // j=1 {2,3,4,5,6,5,4,3,2,3};
				{	sum1=sum;    // i am assigning  //2 going in
					sum1=sum1+a[j];    // j[1]=3    sum1=2+3....
					if((sum1==m)&&((a[i]!=a[j]+1)|| a[i]!=a[j]-1))
					{	sum1=sum;
						System.out.println(a[i]+" "+a[j]);
					}
					else if(sum1>m)
					{ sum1=sum;
						continue;
					}
					else    // entering into k   sum1 = 5
					{	
						for(k=j+1;k<n;k++)   // k=2 ,3     {2,3,4,5,6,5,4,3,2,3};
						{	sum2=sum1;    //sum2 =5......
							sum2=sum2+a[k];    //sum2 = 2+3+5 10....
							if(sum2==m && ((a[i]!=a[j]+1)|| a[i]!=a[j]-1 || a[j]!=a[k]+1 || a[j]!=a[k]-1))
							{	//sum2=sum1;
								System.out.println(a[i]+" "+a[j]+" "+a[k]);
							}
							else if(sum2>m)
							{	sum2=sum1;
								continue;
							}
							else             // entering into l
							{	
								for(l=k+1;l<n;l++)   //l=3,4   {2,3,4,5,6,5,4,3,2,3};       
								{	int sum3=sum2;    // sum3=10
									sum3=sum3+a[l];   //    sum3=9+4 =14....9+6....9+4...9+3..
									if(sum3==m  && ((a[i]!=a[j]+1) || a[i]!=a[j]-1 || a[j]!=a[k]+1 || a[j]!=a[k]-1 || a[k]!=a[l]-1 || a[k]!=a[l]+1 ))
									{	sum3=sum2;
										System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
									}
									else if(sum3>m)
									{ 	sum3=sum2;
										continue;
									}
									else    // sum3=14  entering into o
									{	     // sum4 =14
										for(int o=l+1;o<n;o++)   //o=4,  {2,3,4,5,6,5,4,3,2,3};
										{	int sum4=sum3;
											sum4=sum4+a[o];       //sum4=14+6  ...13+2..12+3....
											if((sum4==m) && ((a[i]!=a[j]+1) || a[i]!=a[j]-1 || a[j]!=a[k]+1 || a[j]!=a[k]-1 || a[k]!=a[l]-1 || a[k]!=a[l]+1 || a[l]!=a[o]+1 || a[l]!=a[o]-1 ))
											{	sum4=sum3;
												System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[o]);
											}
											else if(sum4>m)
											{	sum4=sum3;    // sum4 = 14,
												continue;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
