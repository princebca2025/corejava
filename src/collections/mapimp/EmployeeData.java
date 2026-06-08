package collections.mapimp;

import java.util.HashMap;
import java.util.Map;

public class EmployeeData {
    public static void main(String[] args) {

        Map<String,String>map = new HashMap<>();
        map.put("Employee Name","Ankit shooter");
        map.put("Employee ID","102");
        map.put("Employee Salary","100000");
        map.put("Employee Age","45");
        map.put("Employee mobile no.","985673833");
        map.put("Employee Role","Java devloper");
        map.put("Employee Address","Noida");
        System.out.println(map);
        System.out.println(map.hashCode());
        System.out.println(map.keySet());
        for(String Str: map.keySet())
        {
            System.out.println(Str);
        }
    }
}
