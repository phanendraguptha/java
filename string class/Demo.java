class Demo{
	public static void main(String args[])
	{
		String s1,s2;
		char s3;
		s1="hi ";
		s2 = s1.concat("phani");//concat (which is used for concatination)
		s3 = "abc".charAt(1);//charAt  (which will gives the character at that particular location in the string only)
		System.out.println("s2 is "+s2);
		System.out.println("s3 is "+s3);
		
		String s4 = "India";
		char c[] = s4.toCharArray();//toCharArray (for converting the string to character array)
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}

		String s = "KAMAL";
		char b[] = new char [10];	
		b[0] = 'N';
		b[1] = 'E';
		b[2] = 'E';
		b[3] = 'L';
		s.getChars(0, 4, b, 4);//get characters from the s[(0,4)- 4 elements] and added to the b at location 4
		//s.getChars(0, 4, b, 3);//overwrites the 3rd location in b and will add 4 elements form (0,4)
		System.out.println(b);

	}
}