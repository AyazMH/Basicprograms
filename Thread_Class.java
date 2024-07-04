package java_basics;

public class Thread_Class 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(" Hello Moring");
		Thread.sleep(5000);
		System.out.println(" Hello Moring after thread");
		throw new NullPointerException("it is a exception");
	}

}
