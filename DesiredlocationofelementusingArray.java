import java.util.Scanner;
class DesiredlocationofelementusingArray
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
                System.out.println("Enter the element to be inserted");
                 element=sc.nextInt();
               System.out.println("Enter the index to be  inserted");
                 index=sc.nextInt();
		
		for(i=n;i>=index;i--)	
		{
                   a[i]=a[i-1];
		}
              n++;
              for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
		
		