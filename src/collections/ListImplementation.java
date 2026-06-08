package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ListImplementation {

    public static void main(String[] args) {

        // Creating Collection
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();

        // 1. add()
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");
        System.out.println("1. add(): " + c1);

        // 2. addAll()
        c2.add("HTML");
        c2.add("CSS");

        c1.addAll(c2);
        System.out.println("2. addAll(): " + c1);

        // 3. remove()
        c1.remove("Python");
        System.out.println("3. remove(): " + c1);

        // 4. removeAll()
        c1.removeAll(c2);
        System.out.println("4. removeAll(): " + c1);

        // 5. retainAll()
        Collection<String> c3 = new ArrayList<>();
        c3.add("Java");
        c3.add("Spring");

        c1.add("Spring");
        c1.retainAll(c3);
        System.out.println("5. retainAll(): " + c1);

        // 6. contains()
        System.out.println("6. contains(): " + c1.contains("Java"));

        // 7. containsAll()
        System.out.println("7. containsAll(): " + c1.containsAll(c3));

        // 8. size()
        System.out.println("8. size(): " + c1.size());

        // 9. isEmpty()
        System.out.println("9. isEmpty(): " + c1.isEmpty());

        // 10. iterator()
        System.out.println("10. iterator(): ");
        for(String s : c1) {
            System.out.println(s);
        }

        // 11. toArray()
        Object[] arr = c1.toArray();
        System.out.println("11. toArray(): " + Arrays.toString(arr));

        // 12. equals()
        System.out.println("12. equals(): " + c1.equals(c3));

        // 13. hashCode()
        System.out.println("13. hashCode(): " + c1.hashCode());

        // 14. stream()
        System.out.println("14. stream(): ");
        c1.stream().forEach(System.out::println);

        // 15. forEach()
        System.out.println("15. forEach(): ");
        c1.forEach(System.out::println);

        // 16. parallelStream()
        System.out.println("16. parallelStream(): ");
        c1.parallelStream().forEach(System.out::println);

        // 17. spliterator()
        System.out.println("17. spliterator(): ");
        c1.spliterator().forEachRemaining(System.out::println);

        // 18. clear()
        c1.clear();
        System.out.println("18. clear(): " + c1);
    }
}