import java.util.Scanner;
//  sum of each row and column
class TwodArray6
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,rsum,csum;
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
		{	rsum=0;
			for(j=0;j<m;j++)
			{	rsum=rsum+a[i][j];						// we can also write the csum condition  here without second for loop
			}
			System.out.println("sum of the ..."+i+"th    row   "+rsum);
		}
		
		for(i=0;i<n;i++)
		{	csum=0;								
			for(j=0;j<m;j++)
			{	csum=csum+a[j][i];
			}
			System.out.println("sum of the ..."+i+"th  column    "+csum);
		}
	}
}