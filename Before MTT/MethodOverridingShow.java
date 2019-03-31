class Parent
{
    void show()
    {
        System.out.println("Parent's show()");
    }
}
 
class Child extends Parent
{
    void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}
 
class MethodOverridingShow
{
    public static void main(String[] args)
    {
        Parent obj = new Child(); //run time polymorphism
        obj.show();
    }
}
