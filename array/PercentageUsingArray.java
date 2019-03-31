import java.util.scanner;
class PercentageUsingArray
{
	public static void main(String[] args){
		System.out.prinln("Enter the no of subjects");
		Scanner in = new Scanner(System.in);
		int sub;
		sub=in.nextInt();
		System.out.println("Enter the maximum marks");
		float max;
		max=in.nextInt();
		float totalmax=sub*max;

		int marks[]=new int[sub];
		for(i=0;i<sub;i++)
		{
			System.out.println("enter the marks of" +i+ "subject");
			marks[i]=in.nextInt();
		}
	}
}