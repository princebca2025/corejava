package collections;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {

    public static void main(String[] args) {

        // Creating Set
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // 1. add()
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        System.out.println("1. add(): " + set1);

        // Duplicate value
        set1.add("Java");
        System.out.println("Duplicate not allowed: " + set1);

        // 2. addAll()
        set2.add("HTML");
        set2.add("CSS");

        set1.addAll(set2);
        System.out.println("2. addAll(): " + set1);

        // 3. remove()
        set1.remove("Python");
        System.out.println("3. remove(): " + set1);

        // 4. removeAll()
        set1.removeAll(set2);
        System.out.println("4. removeAll(): " + set1);

        // 5. retainAll()
        Set<String> set3 = new HashSet<>();
        set3.add("Java");
        set3.add("Spring");

        set1.add("Spring");
        set1.retainAll(set3);

        System.out.println("5. retainAll(): " + set1);

        // 6. contains()
        System.out.println("6. contains(): " + set1.contains("Java"));

        // 7. containsAll()
        System.out.println("7. containsAll(): " + set1.containsAll(set3));

        // 8. size()
        System.out.println("8. size(): " + set1.size());

        // 9. isEmpty()
        System.out.println("9. isEmpty(): " + set1.isEmpty());

        // 10. iterator()
        System.out.println("10. iterator(): ");
        for(String s : set1) {
            System.out.println(s);
        }

        // 11. toArray()
        Object[] arr = set1.toArray();

        System.out.println("11. toArray(): ");
        for(Object obj : arr) {
            System.out.println(obj);
        }

        // 12. equals()
        System.out.println("12. equals(): " + set1.equals(set3));

        // 13. hashCode()
        System.out.println("13. hashCode(): " + set1.hashCode());

        // 14. stream()
        System.out.println("14. stream(): ");
        set1.stream().forEach(System.out::println);

        // 15. forEach()
        System.out.println("15. forEach(): ");
        set1.forEach(System.out::println);

        // 16. parallelStream()
        System.out.println("16. parallelStream(): ");
        set1.parallelStream().forEach(System.out::println);

        // 17. spliterator()
        System.out.println("17. spliterator(): ");
        set1.spliterator().forEachRemaining(System.out::println);

        // 18. clear()
        set1.clear();
        System.out.println("18. clear(): " + set1);
    }
}