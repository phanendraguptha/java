import java.util.Scanner;
class Convert
{
int[] doubleToInt(double a[],int n)
{
int b[]=new int[n];
int k=0;
for(double i:a)
{
b[k]=(int)i;
k++;
}
return b;
}
public static void main(String args[])
{
int n;
Convert c=new Convert();
Scanner s=new Scanner(System.in);
System.out.print("Enter how many number u want to enter: ");
n=s.nextInt();
double a[]=new double[n];
int b[]=new int[n];
System.out.println("Enter "+n+ " values");
for(int i=0;i<n;i++)
{
a[i]=s.nextDouble();
}
b=c.doubleToInt(a,n);
System.out.print("Values after Convertion");
for(int i:b)
{
System.out.println(i);
}
}
}