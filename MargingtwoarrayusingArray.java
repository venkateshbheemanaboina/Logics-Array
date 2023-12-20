import java.util.Scanner;
class MergingtwoarrayusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,j,m;

		System.out.println("Enter the length of the array a");
		n=sc.nextInt();

		System.out.println("Enter the length of the array b");
		m=sc.nextInt();
		int a[]=new int[10];
		int b[] =new int[10];
		int c[] =new int[n+m];
		System.out.println("Enter the a array elements "); 
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the b array elements "); 
		for(i=0;i<m;i++)
		{	b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)	
		{	c[i]=a[i];
		}
		j=i;
		for(i=0;i<m;i++)
		{	c[j]=b[i];
			j++;
		}
		for(i=0;i<j;i++)
			System.out.print(c[i]+" ");
	}
}
		
		