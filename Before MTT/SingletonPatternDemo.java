

public class SingletonPatternDemo
 {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor MySingleton() is not visible
      //MySingleton object = new MySingleton();

      //Get the only object available
      MySingleton object = MySingleton.getInstance();

      //show the message
      object.showMessage();
   }
}
