import java.util.Scanner;
class TwodArray1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,sum=0,product=1;
		System.out.println("Enter the length of rows");
		n=sc.nextInt();
		System.out.println("Enter the length of column");
		m=sc.nextInt();

		int a[][]=new int[n][m];
		
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	a[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	sum=sum+a[i][j];
				product=product*a[i][j];
			}
		}
		System.out.println("sum of elements...."+sum);
		System.out.println("Product of elements...."+product);
	}
}