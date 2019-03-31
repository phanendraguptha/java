import java.util.ArrayList;
import java.util.Collection;
class ArrayListExample
{
public static void main(String a[])
{
Collection c=new ArrayList();
c.add("Ajay");
c.add(7);
c.add("Kartik");
c.add("Manik");
ArrayList al=new ArrayList(c);
al.add("Rahul");
al.add("Sakshi");
al.add("Amit");
al.add("Sai Teja");
al.add("Sakshi");
al.add("Palak");
al.add("Arpit");
al.add("Uma");
//al.set(2,"Saurav");
al.add("Sakshi");
//al.addAll(4,c);
System.out.println(al);
//System.out.println(al.contains("Sai Teja"));
//System.out.println(al.get(4));
//System.out.println(al.indexOf("Uma"));
//System.out.println(al.lastIndexOf("Uma"));
//System.out.println(al.size());
//al.clear();
//System.out.println(al);

}
}