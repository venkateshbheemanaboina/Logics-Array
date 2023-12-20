import java.util.Scanner;
class LeftRotationusingarry
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp,n,rotation;

		System.out.println("Enter the length of the array a");
		n=sc.nextInt();
		System.out.println("Enter the rotation of the array a");
		rotation=sc.nextInt();

		int a[]=new int[10];
		System.out.println("Enter the a array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<rotation;i++)
		{	temp=a[0];
			for(j=0;j<n-1;j++)
			{	
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
		
		