package testPjt.src;

public class BasicDataType {
    public static void main(String[] args) {
        char c = 'a'; // char형을 초기화 할 때는 ''사용
        int o = 012; // ==10 8진수(0으로 시작)
        int i = 10;
        int h = 0xA; // ==10 16진수(0x로 시작)
        long l = 9223372036854775807L; // long형은 접미사 L 또는 l을 붙임(l은 1과 비슷해 보이므로 지양)
        float f = 3.14f; // float형은 접미사 F 또는 f를 붙임
        double d = 314e-2;
        boolean b = false;
        System.out.println("c = " + c);
        System.out.println("o = " + o + ", i = " + i + ", h = " + h + ", l = " + l);
        System.out.println("o + i + h = " + (o + i + h)); // +, -, *, /, % 등 연산 수행가능
        System.out.println("i++ = " + (i++) + ", after i++ = " + i);
        i = 10;
        System.out.println("++i = " + (++i) + ", after ++i = " + i);
        System.out.println("f = " + f + ", d = " + d);
        System.out.println("b = " + b);

        String s1 = "Hello World!"; // String형은 객체 데이터 타입
        String s2 = new String("Hello World!"); // s1 == s2
        System.out.println("s1 = " + s1 + ", s2 = " + s2);

        // 자동 형 변환
        byte b1 = 10;
        int i1 = b1;
        System.out.println(i1);

        // 명시적 형 변환
        int i2 = 100;
        byte b2 = (byte) i2;
        System.out.println(b2);

        // 데이터 손실
        int i3 = 123456;
        byte b3 = (byte) i3;
        System.out.println(b3);
    }
}
