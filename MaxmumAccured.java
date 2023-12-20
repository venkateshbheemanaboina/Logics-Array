import java.util.Scanner;
class MaxmumAccured
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		int i,j,count=0,count1=0,n,a=0;
		System.out.println("Enter the lenth of the array");
		n=sc.nextInt();
		int hi[]=new int[n];
		System.out.println("Enter the array elemenets");
		for(i=0;i<n;i++)
			hi[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{	count1=0;
			for(j=i;j<n;j++)
			{	if(hi[i]==hi[j])
				{	count1++;
				}
			}
			if(count<count1)
			{	count=count1;
				a=hi[i];
			}
		}
		System.out.println("maximum accured element is ..."+a);	
	}
}
				
				
			