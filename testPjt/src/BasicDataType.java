package testPjt.src;

public class BasicDataType {
    public static void main(String[] args) {
        char c = 'a'; // char형을 초기화 할 때는 ''사용
        int i = 10;
        double d = 3.14;
        boolean b = false;
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("b = " + b);

        String s = "Hello World!"; // String형은 객체 데이터 타입
        System.out.println("s = " + s);

        // 자동 형 변환
        byte b1 = 10;
        int i1 = b1;
        System.out.println(b1);

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
