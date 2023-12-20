import java.util.Scanner;
class FirstoffofArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a[]=new int[10];
		int n,i,positive=0,negative=0;
		System.out.println("Enter the size");
		n=sc.nextInt();
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("First off of array");
		for(i=0;i<n/2;i++)
		{	
			System.out.println(a[i]);
		}
		
		
	}
}