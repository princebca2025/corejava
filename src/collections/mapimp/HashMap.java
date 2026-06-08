package collections.mapimp;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
    Map<String,Integer>map=new java.util.HashMap<>();
    map.put("prince",21);
    map.put("laptop",87000);
    map.put("mobile",150000);
    map.put("chair",3500);
    map.put("A/C",40000);
    map.put("table",5000);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("mobile"));
        System.out.println(map.isEmpty());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.hashCode());
        System.out.println(map.containsKey("mobile"));
        System.out.println(map.remove("mobile"));
        System.out.println(map);
        map.forEach((Key,Value)->
        {
            System.out.println(Key+"->"+Value);
        });
    }
}

