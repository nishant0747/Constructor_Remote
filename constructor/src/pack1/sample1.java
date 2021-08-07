package pack1;

public class sample1 
{
	float a;
	int b;
	int m;
	String h;

	sample1()
	{
		a = 15;
		b = 15;
	
	}

	sample1(int x,int y)
	{
		a = x;
		b = y;	
	
	}
	
	sample1(float c, char d)
	{
		a = c;
		b = d;
		
	}
	sample1(int x, int y, int z, String g)
	{
		a = x;
		b = y;
		m = z;
		h = g;
	} 
	public void m1() 
	{
		
		System.out.println(m+a+b+h);
	}
	
}
