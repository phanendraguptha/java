class abcd
{
	int d;
	int swi(int a, int b, int c)
	{
		switch(c){
			case 0:
				d=a+b;
				return d;
			default:
				System.out.println("enter vadlid");
				// System.out.println("sum is"+c);
		}
	}
}

class add_add{
	public static void main(String args[]){
		int x,y,z,our;
		System.out.println("Enter an integer to chcek ");
        Scanner in =  new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("Enter you choice");
        z=in.nextInt();
        abcd obj = new abcd();
        our=obj.swi(x,y,z);
        System.out.println(our);

		// int z;
		// abcd obj =  new abcd();
		// z=obj.add(4,5);
		// System.out.println(z);
	}
}