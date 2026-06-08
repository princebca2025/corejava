package collections.Int.Hash;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> lhs=new java.util.LinkedHashSet<>();
        lhs.add(56);
        lhs.add(78);
        lhs.add(71);
        lhs.add(92);
        lhs.add(44);
        System.out.println(lhs);
        Iterator<Integer> itr= lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
