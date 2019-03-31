class abc
{
	int x;
	int y;
	abc()
	{}

	abc(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class PractiseThis
{
	public static void main(String[] args) {
	abc obj = new abc(10,20);
	System.out.println(obj.x);
	System.out.println(obj.y);	
	}
	
}