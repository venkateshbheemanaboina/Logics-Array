import java.util.Scanner;
class DeleteofelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,element,index;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
               System.out.println("Enter the index to be  delete");
                 index=sc.nextInt();
		
		for(i=0;i<n;i++)	
		{	if(i>=index)
                 		  a[i]=a[i+1];
		}
		//n--;
             for(i=0;i<n-1;i++)
		System.out.print(a[i]+" ");
	}
}
		
		