import java.util.*;
public class LibraryProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the days for the book issued:");
        int days=sc.nextInt();
        double charge=0;
        if(days<=5){
            charge=days*2.0;
        }
        else if(days<=10){
            charge=(5*2.0)+(days-5)*3.0;
        }
        else if(days<=15){
            charge=(5*2.0)+(5*3.0)+(days-10)*4.0;
        }
        else{
            charge=(5*2.0)+(5*3.0)+(5*4.0)+(days-15)*5.0;
        }
        charge+=250;
        System.out.println("Total Charges for Library:"+charge);
        sc.close();
    }
}
