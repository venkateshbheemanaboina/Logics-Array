import java.util.Scanner;
class SearchelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,element,n,found=0;
		System.out.println("Enter the length of the arra");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the key element");
		element=sc.nextInt();
		for(i=0;i<n;i++)	
		{
			if(a[i]==element)
			{
				found=1;
				break;
			}
		}
		if(found==1)
			System.out.println("index of array is..."+i);
		else
			System.out.println("key element not found");
	}
}
		
		