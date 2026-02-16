public class HierarchicalInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.PrintA();  // Method from class A
        b.PrintB();  // Method from class B
        System.out.println("----------------------------------------------------------");
        C c = new C();
        c.PrintA();  // Method from class A
        c.PrintC();  // Method from class C
    }
}

// Parent class
class A {
    static{
        System.out.println("Class A static block");
    }
    {
        System.out.println ("Class A non-static block");
    }
    public A(){
        System.out.println ("Class A constructor block");
    }
    public void PrintA() {
        System.out.println("Class A method block");
    }
}

// Child class 1
class B extends A {
    static{
        System.out.println("Class B Static block");
    }
    {
        System.out.println("Class B non-static block");
    }
    public B(){
        System.out.println("Class B constructor block ");
    }
    public void PrintB() {
        System.out.println("Class B method block");
    }
}

// Child class 2
class C extends A {
    static{
        System.out.println("Class C static block");
    }
    {
        System.out.println("Class C non-static block");
    }
    public C(){
        System.out.println("Class C constructor block");
    }
    public void PrintC() {
        System.out.println("Class C method block");
    }
}
