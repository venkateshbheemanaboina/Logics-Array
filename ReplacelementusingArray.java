import java.util.Scanner;
class ReplacelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,element,n,replace;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the key element");
		element=sc.nextInt();
		System.out.println("Enter the replace element");
		replace=sc.nextInt();
		for(i=0;i<n;i++)	
		{
			if(a[i]==element)
			{
				System.out.print(replace +" ");
			}
			else
				System.out.print(a[i]+" ");
		}
	}
}
		
		