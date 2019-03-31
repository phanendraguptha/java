interface Drawable
{
	public void draw();
}
public classs LambdaExpressionExample2
{
	public static void main(String args[])
	{
		int width=10;

		//without lambda
		Drawable d2=() ->
		{
				System.out.println("Drawing "+width);
		};
		d.draw();
	}
}