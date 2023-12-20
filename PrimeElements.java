import java.util.Scanner;
class PrimeElements
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i,j,n,count;
		System.out.println("Enter the length");
		n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{	count=0;
			for(j=2;j<=a[i]/2;j++)
			{	if(a[i]%j==0){
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(a[i]+"  ");
		}
	}
}
		 