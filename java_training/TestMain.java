interface Inter1
{
	void meth1();
	int x=6;
}

interface Inter2
{
	void meth2();
}

class TestInterface implements Inter1, Inter2
{
	public void meth1()
	{
		System.out.println("Overriding......"+x);
	}
	public void meth2()
	{
		System.out.println("Overriding......2");
	}
}

class TestInterMain
{
	public static void main(String args[])
	{
		TestInterface i1 = new TestInterface(); 
		i1.meth1();
		i1.meth2();
	}
}