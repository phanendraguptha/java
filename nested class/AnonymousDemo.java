class Age
{
	int x=23;
	void getAge()
	{
		System.out.println("Hello");
	}
}
class AnonymousDemo
{
	public static void main(String args[])
	{
		Age obj1=new Age(){
			public void getAge(){
				System.out.print("Age is"+x);
			}
		};
		obj1.getAge();
	}
}