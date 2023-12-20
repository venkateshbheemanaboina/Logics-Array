import java.util.Scanner;
class TwodArray2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,psum=0,osum=0;
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
			{	if(i==j)
					psum=psum+a[i][j];
				if(i+j==n-1)
					osum=osum+a[i][j];
			}
		}
		System.out.println("sum of elements...."+(psum+osum));
	}
}