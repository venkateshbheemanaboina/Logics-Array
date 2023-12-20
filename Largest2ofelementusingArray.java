import java.util.Scanner;
//pending
class Largest2ofelementusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,largest,larg2;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array elements "); 
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		larg2=(a[0]>a[1]?a[1]:a[0]);
		largest=a[0];
		for(i=0;i<n;i++)	
		{
		     if(a[i]>=largest)
			{
				larg2=largest;
				largest=a[i];
	
			}
            	
		}
              System.out.println("largest .."+largest);
	      System.out.println("second largest....."+larg2);

	}
}
		
		