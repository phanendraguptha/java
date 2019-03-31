//by changing the order of parameter
class abc{
	public void order(String name, int id)
	{
		System.out.println("geekName :"+ name + " " + "Id :" +id);
	}
	public void order(int id, String name)
	{
		System.out.println("geekName :"+ name + " " + "Id :" +id);
	}
}
class MethodOverloading3
{
	public static void main(String args[]){
		abc obj=new abc();
		obj.order("Mohit",1);
		obj.order(2,"shubham");
	}
}