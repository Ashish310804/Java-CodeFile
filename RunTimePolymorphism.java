public class RunTimePolymorphism {
    /*
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();

        Dog d = new Dog();
        d.display();
        d.bark();

        Cat c = new Cat();
        c.display();
        c.mew();
    }
    */
}

/*
class Animal{
      public void display(){                   //VIRTUAL METHOD (common method in parent and childs)
        System.out.println("Animal Makes Sound!");
      }
}

class Dog extends Animal{
    @Override
    public void display(){                    //Method Overiding
        System.out.println("Dog Barks!");
    }
    public void bark(){
        System.out.println("Dog Barks Loudly!");
    } 
}

class Cat extends Dog{
    @Override
    public void display(){                    //Method Overiding
        System.out.println("Cat mews!");
    }
    public void mew(){
        System.out.println("Cat mews quitely!");
    } 
}
*/