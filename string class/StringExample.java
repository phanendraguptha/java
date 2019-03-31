public class StringExample{
	public static void main(String args[])
	{
		String s="Hello Stusdents";
		String s1="Hello Students";
		System.out.println(s.charAt(3));//l
		System.out.println(s.startsWith("hello"));//false
		System.out.println(s.endsWith("ents."));//true
		boolean b=s.endsWith("ents.");
		System.out.println(b);//true
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//false
		System.out.println(s.length());//16
		System.out.println(s1.indexOf('s'));//6
		System.out.println(s1.indexOf('s',10));//13
		System.out.println(s1.lastIndexOf('s'));//13
		System.out.println(s1.lastIndexOf('s',12));//6
		String ss="one,two,three";
		String[] sa=ss.split(",");
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		String str="Hello world";
		int length=str.length();
		System.out.println("Length of a string is:"+length);
		String s11="Welcome to Java";
		String s2=new String("Welcome to Java");
		String s3="Welcome to Java";
		String s4=new String("Welcome to Java");
		System.out.println("s11 == s2 is " + (s11==s2));//address matching//false
		System.out.println("s11 == s3 is "+ (s11 == s3));//true
		System.out.println("s2 == s3 is " + (s2 == s3));//false
		System.out.println("s2 == s4 is " + (s2 == s4));//false
		String s5=new String("Hello");
		String s6=new String("Welcome");
		String s7="Hello Worlde";
		if(s5.equals(s6)){
			System.out.println("s5 and s6 have the same contents.");
		}
		if(s5 == s6){
			System.out.println("s5 and s6 have the same references");
		}
		if(s5.compareTo(s7)>0){
			System.out.println("s5 is greater tha s7."+s5.compareTo(s7));
		}
		else if(s5.compareTo(s7)==0){
			System.out.println("s5 and s7 have the same contents."+s5.compareTo(s7));
		}
		else{
			System.out.println("s5 is less than s7."+s5.compareTo(s7));
		}

		String sa1=String.join("-","hello","world");
		System.out.println(sa1);
		String sa11="My";
		String sa12="Java Join";
		String sa13=String.join("-",sa11,sa12);
		System.out.println(sa13);
	}
}
