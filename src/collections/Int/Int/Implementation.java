package collections.Int.Int;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        List<Integer> lst3=new ArrayList<>();
        lst3.add(54);
        lst3.add(45);
        lst3.add(67);
        lst3.add(76);
        lst3.add(45);
        lst3.add(37);
        System.out.println(lst3);
        Collections.sort(lst3);
        System.out.println(lst3);
        lst3.remove(2);
        System.out.println(lst3);
        //lst3.clear();
        System.out.println(lst3);
        lst3.add(67);
        System.out.println(lst3);
        lst3.get(1);
        System.out.println(lst3.get(1));
        lst3.contains(45);
        System.out.println(lst3.contains(45));
        lst3.hashCode();
        System.out.println( lst3.hashCode());
       // lst3.size();
        System.out.println(lst3.size());
        lst3.set(3,99);
        System.out.println(lst3);
        System.out.println(lst3.isEmpty());




    }
}
