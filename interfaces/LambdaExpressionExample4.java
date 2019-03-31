interface Sayable
{
	public String say(String name);
}
public class LambdaExpressionExample4
{
	public static void main(String args[])
	{
		//lamda expression with singl parameter
		Sayable s1=(name)->
		{
			return "hello, "+name;
		};
		System.out.println(s1.say("Sonoo"));

		//you can omit function parentheses
		Sayable s2=name->
		{
			return "Hello, "+name;
		};
		System.out.println(s2.say("Sonoo"));
	}
}