import java.util.*;
class Student
{	
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}
class Arrayofobjects
{
	public static void main(String args[])
	{
		Student s[] = new Student[5];
		s[0]=new Student(1,"venkatesh");
		s[1]=new Student(2,"Uday");
		s[2]=new Student(3,"prasanth");
		s[3]=new Student(4,"Parth");
		s[4]=new Student(5,"Jaideep");
	
		int i;
		for(i=0;i<5;i++)
			System.out.println(s[i].rollno+ "   "+s[i].name);
	}
}
			