package testPjt.src;

public class StringClass {
    public static void main(String[] args) {
        String a = "Hello Java"; // == new String("Happy Java");
        String b = "a"; // == new String("a");
        String c = "123"; // == new String("123");
        // new는 객체를 만들 때 사용
        // String은 primitive(원시) 자료형 아님
        // primitive(원시) 자료형: int, long, double 등
        // 원시 자료형은 new 키워드로 생성할 수 없음

        // 0123456789
        // Hello Java
        System.out.println(a.indexOf("Java"));
        // substring(start, end); -> start <= index < end
        System.out.println(a.substring(a.indexOf("Java"), a.length()));

        System.out.println(a.replaceAll("Java", "World!"));
        System.out.println(a.toUpperCase());

        a = "hello";
        c = "hello";
        System.out.println(a.equals(b)); // a == b
        System.out.println(a.equals(c)); // a == c
    }
}
