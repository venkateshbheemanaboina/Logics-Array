import java.util.Scanner;
class MissingElements
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter the length");
		n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{	if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{	if(i<n-1)
			{
			for(j=a[i]+1;j<a[i+1];j++)
				System.out.print(j+" ");
			}
		}
	}
}
		 