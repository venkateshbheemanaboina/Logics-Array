import java.util.Scanner;
//replacing source element with replacing element
class TwodArray3
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,selement,relement;
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
		System.out.println("Enter the source element");
		selement=sc.nextInt();
		System.out.println("Enter the replace element");
		relement=sc.nextInt();
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	if(a[i][j]==selement)
				{	a[i][j]=relement;      // if in array there is a any duplicate elements but u dont want to replace all the duplicates with replacing elenet then use break
				}	
			}
		}
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}