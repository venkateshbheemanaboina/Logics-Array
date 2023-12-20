import java.util.Scanner;
class Arrayriverse
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
		System.out.println("reverse order of array");
		for(i=n-1;i>=0;i--)
		{	
			System.out.println(a[i]);
		}
		
		
	}
}