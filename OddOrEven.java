import java.util.Scanner;
class OddOrEven
{
  public static void main(Int args[])
  {
    int x;
    System.out.println("Enter an integer to chcek ");
    Scanner in =  new Scanner(System.in);
    x=in.nextInt();
    if(x%2 ==0){
      System.out.println("you entered an even number");
    }
    else{
      System.out.println("you entered an odd number");
    }
  }
}