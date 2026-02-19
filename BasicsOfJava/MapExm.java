import java.util.Map;
import java.util.HashMap;
public class MapExm {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Orange");
        System.out.println("Elements of map: " + map);
    }
}
