package collections.Int.Hash;

import learnjava.New;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeHashSet {
    public static void main(String[] args) {
        Set<Integer> ts=new TreeSet<>();
        ts.add(76);
        ts.add(89);
        ts.add(67);
        ts.add(63);
        ts.add(23);
        System.out.println(ts);
        Iterator<Integer> itr= ts.iterator();
        while (itr.hasNext());
        {
            System.out.println(itr.next());
        }
      //  ts.clear();
      //  System.out.println(ts);



    }
}
