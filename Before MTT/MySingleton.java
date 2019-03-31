class MySingleton
{
   private static MySingleton ob;
   private MySingleton(){}

   public static MySingleton getInstance()
      {
	 if(ob==null){
   	 ob=new MySingleton();	 
      }
      return ob;
    }

     void showMessage()
     {
      System.out.println("Hello World!");
   }
}