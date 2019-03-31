import java.util.Scanner;
import java.lang.String;

class ScannerExample
{
	public static void main(String[] args)
	{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bo;
		String c;
		String s1;
		char c1;

		Scanner in =  new Scanner(System.in);

		System.out.println("Enter a String");
		s1=in.nextLine();
		System.out.println("string:"+s1);

		System.out.println("enter a byte");
		b=in.nextByte();
		System.out.println("byte:"+b);

		System.out.println("Enter a short");
		s=in.nextShort();
		System.out.println("short:"+s);

		System.out.println("Enter an integer");
		i=in.nextInt();
		System.out.println("integer:"+i);

		System.out.println("enter a long");
		l=in.nextLong();
		System.out.println("long:"+l);

		System.out.println("enter a Float");
		f=in.nextFloat();
		System.out.println("Float:"+f);

		System.out.println("Enter a Double");
		d=in.nextDouble();
		System.out.println("Double:"+d);

		System.out.println("Enter a Boolean");
		bo=in.nextBoolean();
		System.out.println("Boolean:"+bo);

		System.out.println("Enter a word");
		c=in.next();
		System.out.println("word:"+c);

		System.out.println("print a Character");
		c1=c.charAt(0);
		//c1=in.next().chatAt(1);//charAt(index) is a method present in java.lang.string
		System.out.println("Character:"+c1);
	}
}