import java.util.Scanner;
class RemoveDuplicateElement
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i,j,n,count=0;
		System.out.println("Enter the length");
		n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		/*for(i=0;i<n;i++)
		{	count=0;
			for(j=i+1;j<n;j++)
			{	if(a[i]==a[j])
				{	count++;
					break;	
				}
			}
			if(count!=1)
				System.out.print(a[i]+" ");
		}
	}	
}*/


		for(i=0;i<n;i++)
		{	for(j=i+1;j<n;j++)
			{	if(a[i]==a[j])
				{	for(k=j;k<n-1;k++)
					{	a[k]=a[k+1]	}
					n--;
					j--;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
			
				
			


		
		 