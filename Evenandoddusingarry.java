import java.util.Scanner;
class Evenandoddusingarry
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp,n;

		System.out.println("Enter the length of the array a");
		n=sc.nextInt();

		int a[]=new int[10];
		System.out.println("Enter the a array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{	if(a[i]%2!=0)
				{ 	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
		
		