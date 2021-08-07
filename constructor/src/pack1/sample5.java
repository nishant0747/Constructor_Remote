package pack1;

public class sample5 

{
	int a = 747;
	public static void main(String[] args)
	{
		//new sample5();
		
		new sample5("tarzan");
		
		new sample5(4.6f,'F');
		
		new sample6();
		
	}
	
	 sample5()
	{
		System.out.println("cons1");
	
	}
	
	sample5(String b) //2 parameter
	{
		int a =89;
		System.out.println(this.a);
	}

	 sample5(float c, char d) // 2 parameter
	{
		System.out.println(c);
		System.out.println(d);
	}


}
