import java.util.*;
public class forLoop {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.print("Sum of first n natural numbers for n =");
               int n = sc.nextInt();
               int sum=0;
               for (int i=1 ; i<=n ; i++){
                   sum = sum + i ;
               }
               System.out.print("is:");
               System.out.print(sum);
               sc.close();
    }

}
