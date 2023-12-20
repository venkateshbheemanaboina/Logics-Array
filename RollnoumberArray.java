import java.util.Scanner;
class RollnoumberArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a[]=new String[10];
		int n,i;
		System.out.println("Enter the lenth of the array");
		n=sc.nextInt();
		System.out.println("enter the roll numbers");
		for(i=0;i<n;i++)
			a[i]=sc.next();
		System.out.println("roll numbers are");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}