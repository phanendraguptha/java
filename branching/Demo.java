class Demo
{
	public static void main(String [] rk)
	{
	   outer:	
		for(int i=0; i<3; i++)
		  {
		inner:
		    for(int j=0; j<3; j++)
			{
			   System.out.println(i + ", "+ j);
			   if(j==2)	
			   	  break inner;
			   if(i==j)	
			      continue outer;
			   System.out.println("Bye");	
			}
		  }
	}
}
   


