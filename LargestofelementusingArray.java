import java.util.Scanner;
class LargestofelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,largest;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			largest=a[0];
		for(i=1;i<n;i++)	
		{
		     if(a[i]>largest)
			{
				largest=a[i];
			}
            	
		}
              System.out.println(largest);

	}
}
		
		