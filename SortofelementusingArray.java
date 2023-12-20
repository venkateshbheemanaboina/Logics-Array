import java.util.Scanner;
class SortofelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)	
		{
			for(j=i+1;j<n;j++)
     			{
				if(a[i]>a[j])
   				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
              for(i=0;i<n;i++)
		System.out.print(a[i]+" ");


	}
}
		
		