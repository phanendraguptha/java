interface Drawable
{
	public void draw();
}
public classs LambdaExpressionExample
{
	public static void main(String args[])
	{
		int width=10;

		//without lambda, drawable implementation using anonymous class
		Drawable d=new Drawable()
		{
			public void draw()
			{
				System.out.println("Drawing "+width);
			}
		};
		d.draw();
	}
}