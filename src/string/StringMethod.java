package string;

public class StringMethod {
    public static void main(String[] args) {
        String s=" Prince ";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(0));
        System.out.println(s.startsWith("P"));
        System.out.println(s.endsWith("e"));
        System.out.println(s.contains("g"));
        System.out.println(s.indexOf("i"));
        System.out.println(s.repeat(6));
        System.out.println(s.replace("Prince","Abhi"));
        System.out.println(s.substring(3));
        System.out.println(s.trim());
        String s1= "Abhi";
        String s2= "abi";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
    }
}
