//WAP to create a jagged Array
 //in which rows and columns should be taken as input from user.
import java.util.Scanner;
class JaggedArray
{
 
	public static void main(String[] ar)
	{
		int arr[][];
		int nos;
		Scanner in = new Scanner(System.in);

		nos=in.nextInt();
		arr=new int[nos][];

		for(int i = 0; i<nos; i++)
		{
			System.out.println("Enter the nos of colums in " +i+ "row");
			int no=in.nextInt();
			arr[i]=new int[no];
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values of " +i+ " row");
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j]=in.nextInt();
				}
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				{
					System.out.print("  "+arr[i][j]);
				}
			System.out.println();
			}


	}
}
//sk43287@gmail.com



