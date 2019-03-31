class OuterClass
{
	//static member
	static int outer_x=10;

	//instance(nonstatic member)
	int outer_y=20;

	//private member
	private static int outer_private=30;

	static class StaticNestedClass
	{
		void display()
		{
			//can access static member of outer class
			System.out.println("outer_x = "+outer_x);

			//can access display private static member of outer class
			System.out.println("outer_private = "+outer_private);

			OuterClass obj= new OuterClass();
			//the following statement will give compilation error
			//as static nested class cannot directly access non-static
			System.out.println("outer_y = " + obj.outer_y);
		}
	}
}

//Driver class
public class StaticNestedClassDemo
{
	public static void main(String[] args)
	{
		//accessing a static nested class
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		nestedObject.display();
	}
}