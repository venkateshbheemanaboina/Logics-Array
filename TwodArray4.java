import java.util.Scanner;
//  largest element
class TwodArray4
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m,i,j,largest,c=0,b=0;
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

		largest=a[0][0];
		for(i=0;i<n;i++)
		{	for(j=0;j<m;j++)
			{	if(a[i][j]>largest)
				{	largest=a[i][j];  
					b=i;
					c=j;   
				}	
			}
		}

		System.out.println("largest element is....."+largest);
		System.out.println("location of the largest element.....("+b+","+c+")");
	}
}