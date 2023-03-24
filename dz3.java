import java.util.HashMap;
import java.util.Map;

public class dz3 {
    public static void main(String[] args) {
        
        Map<String, Integer> ne = new HashMap<>();
        
        ne.put("fdaa", 1);
        ne.put("fdda", 1);
        ne.put("fd2", 1);

        System.out.println(ne);

        for (var ar : ne.entrySet()) {
            if(ar.getKey().equals("fd2")){
                ne.put("fd2", ne.get(ar.getKey()) +1);
            }
        }
        System.out.println(ne);
    }
}
