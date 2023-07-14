class a extends Thread 
{
	public void run()
	{
		System.out.println("A");
	}
}

class b extends Thread 
{
	public void run()
	{
		System.out.println("B");
	}
}

class multhread
{
	public static void main(String arf[])
	{

		a a1=new a();
		b b1=new b();

		a1.start();
		b1.start();	
}

}