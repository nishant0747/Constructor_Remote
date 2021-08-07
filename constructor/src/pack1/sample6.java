package pack1;

public class sample6 extends sample5
{
	public static void main(String[] args)
	{
		sample6 s = new sample6();
		s.sample6();
		
		
		new sample5("tarzan");
		
		new sample5(88.9f,'D');
		
	}
	
	sample6()
	{
		System.out.println("I am subclass constructor");
	}
	
	void sample6()  //we should declare return type at the method declaration only
	{
		System.out.println("xxxx");
		
	}

}
