import java.util.Scanner;
// by using sorting
class SecondLast {
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
		for(i=0;i<n;i++)
		{	for(j=i;j<n;j++)
			{ 	if(arr[i]>arr[j])
				{	temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[n-2]);
	}
}
		