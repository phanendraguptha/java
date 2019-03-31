//java programto illustrate constructor chaining ot other classs using super() keyword
class Base
{
	String name;
	//constructor 1
	Base()
	{
		this("");
		System.out.println("no-arguments constructor of" + "base class");
	}
	//constructor 2
	Base(String name)
	{
		this.name=name;
		System.out.println("calling parameterized constructor"+"of base");
	}
}

class Derived extends Base
{
	//constructor 3
	Derived()
	{
		System.out.println("no-arguments constructor of" + "derived class");
	}
	//parameterized constructor 4
	Derived(String name)
	{
		//invokes base class constructor 2
		super(name);
		System.out.println("calling parameterized constructor"+"of derived");
	}

	public static void main(String args[])
	{
		//calls parameterized constructed 4
		//Derived obj=new Derived("test");

		//calls no-argument constructor
		Derived obj=new Derived();
	}
}