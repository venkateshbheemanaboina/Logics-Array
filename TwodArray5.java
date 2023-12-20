import java.util.Scanner;
//  lower and upper diagonal element
class TwodArray5
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j;
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
			{	if(i!=j)
				{	System.out.print(a[i][j]+" ");
				}	
			}
		}
	}
}