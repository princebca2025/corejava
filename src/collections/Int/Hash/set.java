package collections.Int.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(56);
        set.add(45);
        set.add(34);
        set.add(78);
        set.add(32);
        System.out.println(set);
        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext());
        {
            System.out.println(itr.next());
        }


    }


}
