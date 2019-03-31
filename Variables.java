class Variables
{
	int a=2;
	int b=23;  //Instance varibles
	static int c=23;  //Class Variables
	public static void main(String[] args)
	{
		int a=5;   //local variables

		System.out.println(a);

		Variables obj=new Variables();
		Variables obj1=new Variables();

		obj1.a=obj1.a+obj1.b;

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj1.a);
		System.out.println(obj.a);
		System.out.println(Variables.c);


	}
}							