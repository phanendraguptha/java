import java.util.ArrayList;
class TestArrayList {
     public static void main(String[] args) {            
       ArrayList cityList = new ArrayList();
       cityList.add("London");
       cityList.add("New York");
       cityList.add("Paris"); 
        cityList.add(34.5);
        cityList.add("t");
        cityList.add(2);
        cityList.add("Paris");
   System.out.println("List size? " + cityList.size());// 7
      System.out.println("Is London in the list? " +cityList.contains("London")); //true
      System.out.println("Is Toronto in the list? " +cityList.contains("Toronto"));  //false
      System.out.println("The location of last Paris in the list? "+ cityList.lastIndexOf("Paris")); //6
      System.out.println("Is the list empty? " +cityList.isEmpty()); //false
       cityList.add(2, "Beijing");    //added
      cityList.remove("London");
    cityList.indexOf("Paris");
      cityList.remove(2);      
      cityList.set(1,"test");//replace
	//cityList.add(12, "Beijing"); //exception
      for (int i = 0; i < cityList.size(); i++)
      System.out.println(cityList.get(i) + " ");      
    }
  }
  