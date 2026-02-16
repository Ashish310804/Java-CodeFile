public class RunTimePolymorphism02 {
    public static void main(String[] args) {
        //Upcasting means making child as parent
         /* 
        Animal a = new Dog();            //Implicitly or Automatically
        a.display();
        */




        //Downcasting means making parent as child
        /* 
        Animal a = new Dog();
        Dog d = (Dog)a;                 //Explicitly or Forcefully
        d.display();                    //ClassCastException may occur in this method for downcasting
        d.bark();                       
        */

         
        /*
        Animal a = new Dog();            //Upcasting before Downcasting is must
        if (a instanceof Dog){
            Dog d = (Dog)a;
            d.display();
            d.bark();
        }
        else{
            System.out.println("Downcasting Not Possible!!");
        }
        */
    }
}



/*
class Animal{
      public void display(){                   //Virtual Method
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
*/
