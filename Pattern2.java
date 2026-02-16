import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range:");
        int range=sc.nextInt();
        for (int row=1; row<=range ; row++){
            for (int col=1; col<=range ; col++){
                if(row==1 || row==range || col==1 || col==range || row==col || row+col==range ){
                    System.err.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
