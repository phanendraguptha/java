interface Message
{
	void msg();
}
public class AnonymousInterface1
{
	public static void main(String args[])
	{
		Message obj=new Message(){
			public void msg()
			{
				System.out.println("hello");
			}
		}
		obj.msg();
	}
}