//this is the example for methods in inner class(local class)
//if a variable is declared in outer class which is not final that variable cannot be accessed
//in methods of inner class(it throws an error)
class Outer { 
    void outerMethod() { 
        System.out.println("inside outerMethod"); 
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    } 
} 
class MethodDemo { 
    public static void main(String[] args) { 
        Outer x = new Outer(); 
        x.outerMethod(); 
    } 
} 