class abc
{
	int add(int x, int y)
	{
		return (x+y);
	}
}
class Practice
{
	int a;
	public static void main(String[] args) {

		Practice obj = new Practice();
		abc obj1 = new abc();

		obj.a=obj1.add(3,4);
		System.out.println(obj.a);

		
	}
}