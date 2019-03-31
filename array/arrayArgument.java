class arrayArgument{
	public static void main(String args[])
	{
		int num[] = {1,2,3};
		arr(num);
	}
	public static void arr(int a[])
	{
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i])
				min = a[i];
		}
		System.out.println("the minimum value is"+min);
	}
}