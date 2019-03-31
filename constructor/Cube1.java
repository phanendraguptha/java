class Cube1
{
	int length,breadth,height;
	Cube1()
	{
		lenght=10;
		breadth=10;
		height=10;
	}
	Cube1(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	int getVolume()
	{
		return(lenght*breadth*height);
	}
	public static void main(String args[])
	{
		Cube1 c1=new Cube1();
		Cube1 c2=new Cube1(10,20,30);
		System.out.println("volume of cube1 is:" + c1.getVolume());
		System.out.println("volume of cube1 is:" + c2.getVolume());
	}	
}