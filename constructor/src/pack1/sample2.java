package pack1;

public class sample2 
{
	public static void main(String[] args) 
	{
		System.out.println("addition");
		
		sample1 s1= new sample1();
		s1.m1();
		
		sample1 s2 = new sample1(15,15);
		s2.m1();
		
		sample1 s4 = new sample1(4.6f,'d');
		s4.m1();
		
		sample1 s3 = new sample1(15,15,15,"  j");
		s3.m1();
		
	}

}
