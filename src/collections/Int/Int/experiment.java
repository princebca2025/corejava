package collections.Int.Int;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class experiment {
    public static void main(String[] args) {
        List<Integer> lst4=new ArrayList<>();
        lst4.add(87);
        lst4.add(72);
        lst4.add(99);
        lst4.add(34);
        lst4.add(69);
        lst4.add(42);
        System.out.println(lst4);
        Collections.sort(lst4);
        System.out.println(lst4);
        //lst4.clear();
        System.out.println(lst4);
        lst4.add(93);
        System.out.println(lst4);
        lst4.remove(4);
        System.out.println(lst4);
        lst4.get(2);
        System.out.println (lst4.get(2));
        lst4.contains(93);
        System.out.println(lst4);
        lst4.hashCode();
        System.out.println(lst4.hashCode());


    }

}
