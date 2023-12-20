import java.util.Scanner;
class SecondrepetedElement
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i,j,n,temp=0,k=0;
		System.out.println("Enter the length");
		n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{	
			for(j=i+1;j<n;j++)
			{	if(a[i]==a[j])
				{	temp++;
					k=a[i];
					break;
				}
			}	
			if(temp==2)
				{	break;
				}				
		}
		if(temp==2)
			System.out.println("the second repeted element...."+k);
		else
			System.out.println("there is no second repeted element");
	}
}
		 