class ExampleForEach
{
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int sum=0;

		for(int k:a)
		{
			System.out.println("Array values are" +k);
			sum=sum+k;
		}

		System.out.println("the summation is" +sum);
	}
}