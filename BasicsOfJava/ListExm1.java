import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ListExm1 {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<Integer>();
        List<Integer> newlist = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        newlist.add(50);
        newlist.add(80);
        System.out.println("Elements of list:"+list);
        System.out.println("Elements of newlist:"+newlist);
        newlist.addAll(list);
        System.out.println("Elements of newlist with list elements:"+newlist);
        System.out.println("Size of newlist with list elements: "+newlist.size());
        System.out.println("---------------------------------------------------------------");
//First way of traversing
        for (Integer ele:newlist){
            System.out.println("Elements:"+ele);
        }
        newlist.remove(Integer.valueOf(20));
//Second way of traversing using iterator
        Iterator<Integer> itr = newlist.listIterator();
        System.out.println("--------------------------------------------------------------");
        while(itr.hasNext()){
            System.out.println("Element:"+itr.next());
        }
        System.out.println("--------------------------------------------------------------");
    }
}