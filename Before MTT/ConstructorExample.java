class abc
{
	double radius;

	abc()
	{
		radius=2;
		System.out.println("You are in Default Constructor");
		//show();
	}

	abc(int r)
	{
		radius=r;
		System.out.println("you are in Paramaterized Constructor");
		//show();
	}

	void show()
	{
		double sol=(3.14*radius*radius);
		System.out.println("the solution is" +sol);
	}


}

class ConstructorExample
{
	public static void main(String[] args) {

		abc obj = new abc();
		abc obj1 = new abc(5);

		obj.show();
		obj1.show();

		
	}
}