class abcd{
	int c;
	int add(int a, int b){
		c=a+b;
		return c;
	}
}

class add_ad{
	public static void main(String[] args){
		int z;
		abcd obj =  new abcd();
		z=obj.add(4,5);
		System.out.println(z);
	}
}