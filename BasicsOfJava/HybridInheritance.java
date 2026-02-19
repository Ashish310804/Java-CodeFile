public class HybridInheritance {
    /*
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // from Interface A
        obj.methodB(); // from Interface B
        obj.methodC(); // from Class C
        obj.methodD(); // from Class D
    }
    */
}


/* 
// Interface A
interface A {
    public void methodA();
}

// Interface B
interface B {
    public void methodB();
}

// Class C implements both interfaces
class C implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    public void methodC() {
        System.out.println("Method C from Class C");
    }
}

// Class D extends Class C
class D extends C {
    public void methodD() {
        System.out.println("Method D from Class D");
    }
}
*/
