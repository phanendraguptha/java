 import java.util.Scanner;
 class CmdInputSum
 {
	public static void main(String args[])
	{
		System.out.println("length is:"+args.length);
		int num=0;
		for(int i=0;i<args.length;i++)
		{
			//System.out.println(args[i]);
		    num = num+Integer.parseInt(args[i]);
		}
		System.out.println("the sum is"+num);
	}
}