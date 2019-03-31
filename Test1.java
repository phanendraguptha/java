import java.util.Scanner;
Class Test1
{
  public static void main(String args[]){
    char k;
    int starter=60;
    int mainmeal=70;
    int drink=20;
    int s,m,d;
    int total=0;
    System.out.println("for choosing items in the menu use following instructions");
    System.out.println("1)for selecting starter meal");
    System.out.println("2)for selecting main meal");
    System.out.println("3)for selecting drink");
    System.out.println("if you want to select then enter the number mentioned or else enter '0' ");
    Scanner in = new Scanner(System.in);
    
    do{
        s=in.nextInt();
        m=in.nextInt();
        d=in.nextInt();
        if(s==1){
          total=total+starter;
        }
        elseif(m=2){
          total=total+mainmeal;
        }
        elseif(d=3){
          total=total+drink;
        }
        System.out.println("Do you want to add more items press 'y' or else 'n'");
        k=in.nextChar();
    }while(k=="y")
  }
}