import java.util.Scanner;
class SecondoffofArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a[]=new int[10];
		int n,i,positive=0,negative=0;
		System.out.println("Enter the size");
		n=sc.nextInt();
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Second off of array");
		for(i=n/2;i<n;i++)
		{	
			System.out.println(a[i]);
		}
		
		
	}
}