import java.util.Scanner;
// by using sorting
class SecondLast1 {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,last ,last1,j,temp;
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{	arr[i]=sc.nextInt();
		}
		last=arr[0];
		for(i=1;i<n;i++)
		{	if(last<arr[i])
				last=arr[i];
		}
		last1=arr[1];
		for(i=0;arr[i]<last;i++)
		{	if(last1<arr[i])
				last1=arr[i];
		}
		System.out.println("last 2 is..."+last1);
	}
}
		