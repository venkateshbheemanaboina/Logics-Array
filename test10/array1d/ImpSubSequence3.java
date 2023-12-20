package com.test10.array1d;

import java.util.Scanner;

public class ImpSubSequence3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		int a[]= new int[n];
		int i,j,k,l,m,sum=0,sum1=0,sum2=0;
		System.out.println("enter the sum of sub sequence");
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{	sum=a[i];      //2,
			if(sum==m)
			{	System.out.println(a[i]);
			}
			else if(sum>m)
			{	continue;
			} //done
			else 
			{
				for(j=i+1;j<n;j++)    // j=1 {2,3,4,5,6,5,4,3,2,3};
				{	sum1=sum;    // i am assigning  //2 going in
					sum1=sum+a[j];    // j[1]=3    sum1=2+3....
					int a1=Math.abs(a[i]-a[j]); //System.out.println(a1+" H");
					if((sum1==m) && a1!=1)
					{	sum1=sum;
						System.out.println(a[i]+" "+a[j]);
					}
					else if(sum1>m)
					{ sum1=sum;
						continue;
					}          //done
					else    // entering into k   sum1 = 5
					{	
						for(k=j+1;k<n;k++)   // k=2 ,3     {2,3,4,5,6,5,4,3,2,3};
						{	sum2=sum1;    //sum2 =5......     {3,2,5,5,7,8,6,9,15}
							sum2=sum1+a[k]; //  System.out.println(sum2); //sum2 = 2+3+5 10....
							int b1=a[i]-a[j]; // System.out.println(b1+"b1");
							int b2=a[j]-a[k]; // System.out.println(b2+"b2");
							int a2=Math.abs(b1+b2);	//	System.out.println(a2);
							if((sum2==m) && a2!=2)
							{	//sum2=sum1;
								System.out.println(a[i]+" "+a[j]+" "+a[k]);
							}
							else if(sum2>m)
							{	//sum2=sum1;
								continue;
							}
							else             // entering into l
							{	
								for(l=k+1;l<n;l++)   //l=3,4   {2,3,4,5,6,5,4,3,2,3};       
								{	int sum3=sum2;    // sum3=10
									sum3=sum3+a[l];   //    sum3=9+4 =14....9+6....9+4...9+3..
									int b3=a[i]-a[j]; // System.out.println(b3+"b1");
									int b4=a[j]-a[k]; // System.out.println(b4+"b2");
									int b5=a[k]-a[j];
									int a3=Math.abs(b3+b4+b5);	//	System.out.println(a2);
									if(sum3==m  && a3!=3)
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
											int b6=a[i]-a[j]; // System.out.println(b6+"b1");
											int b7=a[j]-a[k]; // System.out.println(b7+"b2");
											int b8=a[k]-a[l];
											int b9=a[l]-a[o];
											int a4=Math.abs(b6+b7+b8+b9);	
											if((sum4==m) && a4!=4)
											{	sum4=sum3;
												System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[o]);
											}
											else if(sum4>m)
											{	sum4=sum3;    // sum4 = 14,
												continue;
											}
											else    // sum3=14  entering into o
											{	     // sum4 =14
												for(int p=l+1;p<n;p++)   //o=4,  {2,3,4,5,6,5,4,3,2,3};
												{	int sum5=sum4;
													sum5=sum4+a[p];      
													int c1=a[i]-a[j]; // System.out.println(c1+"b1");
													int c2=a[j]-a[k]; // System.out.println(c2+"b2");
													int c3=a[k]-a[l];
													int c4=a[l]-a[o];
													int c5=a[o]-a[p];
													int a5=Math.abs(c1+c2+c3+c4+c5);	
													if((sum5==m) && a5!=5)
													{	//sum4=sum3;
														System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[o]+" "+a[p]);
													}
													else if(sum5>m)
													{	//sum4=sum3;    // sum4 = 14,
														continue;
													}
													else    // sum3=14  entering into o
													{	     // sum4 =14
														for(int q=l+1;q<n;q++)   //o=4,  {2,3,4,5,6,5,4,3,2,3};
														{	int sum6=sum5;
															sum6=sum5+a[q];       //sum4=14+6  ...13+2..12+3....
															int d1=a[i]-a[j]; // System.out.println(d1+"b1");
															int d2=a[j]-a[k]; // System.out.println(d2+"b2");
															int d3=a[k]-a[l];
															int d4=a[l]-a[o];
															int d5=a[o]-a[p];
															int d6=a[p]+a[q];
															int a6=Math.abs(d1+d2+d3+d4+d5+d6);	
															if((sum6==m) && a6!=6)
															{	//sum4=sum3;
																System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[o]+" "+a[p]+" "+a[q]);
															}
															else if(sum6>m)
															{	//sum4=sum3;    // sum4 = 14,
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
			}
		}
	}
}
