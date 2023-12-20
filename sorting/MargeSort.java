package searching.sorting;
// not completed
import java.util.Scanner;

public class MargeSort {
	static void mergeSort(int arr[],int left,int mid,int right)
	{	int i,j,k;
		int s1=mid-left+1;
		int s2=right-mid;
		
		// it will create two temporary arrays
		int left_arr[]=new int[s1];
		int right_arr[]=new int[s2];
		
		//it will copy data from original array to temporary arrays
		for(i=0;i<s1;i++)
			left_arr[i]=arr[left+i];
		
		for(j=0;j<s2;j++)
			right_arr[j]=arr[mid+1+j];
		
		i=0;
		j=0;
		k=left;
		while(i<s1 && j<s2)
		{	if(left_arr[i]<=right_arr[j])
			{	arr[k]=left_arr[i];
				i++;
			}
			else
			{	arr[k]=right-arr[j];
				j++;
			}
			k++;
		}
		
		// copying the items of left_arr[] that have been left
		while(i<s1)
		{	arr[k]=left_arr[i];
			i++;
			k++;
		}
		
		//copying the item of right_arr[] that have been left
		while(j<s2)
		{	arr[k]=right_arr[j];
			j++;
			k++;
		}		
	}
	
	static void partition(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			partition(a,low,mid);
			partition(a,mid+1,high);
			mergeSort(a,low,mid,high);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,size;
		
		System.out.println("How meny elements u want to Sort....");
		size=sc.nextInt();
		int a[]= new int[size];
		
		
		System.out.println("Enter the array elements....");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		partition(a,0,size-1);
		
		System.out.println("Sorted list is...");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}