import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListCreation {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements you wants to insert: ");
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<n; i++){
              System.out.println("Enter the element:");
              int elm = sc.nextInt();
            list.add(elm);
    }
    System.out.println("Elements:"+list);
    sc.close();
   } 
}
