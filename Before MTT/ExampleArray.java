import java.util.Scanner;
class var_arr
{	
	double sum;
	double avg;
	double average(double[] arr,int nos)
	{
		for (int i=0; i<nos; i++)
		{
			sum = sum + arr[i];
		}
		avg = sum/nos;
		//System.out.println("Average marks is " +avg);
		return avg;
	}
}

class ExampleArray
{
	int nos;
	double avg;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ExampleArray obj = new ExampleArray();
		var_arr obj1 = new var_arr();

		System.out.println("Enter the nos. of Subject");
		obj.nos=in.nextInt();

		double[] arr = new double[obj.nos];

		for(int i=0; i<obj.nos; i++)
		{
			System.out.println("Enter the marks of Subject " +(i+1));
			arr[i]=in.nextDouble();
		}
		obj.avg = obj1.average(arr,obj.nos);
		System.out.println("Average marks is " +obj.avg);

	}
}