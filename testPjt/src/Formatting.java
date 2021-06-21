package testPjt.src;

public class Formatting {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        char c1 = 'a', c2 = 'b', c3 = 'c';
        float f = 3.14f;
        double d = 3.141592d;

        System.out.println(num1 + "°C");
        System.out.printf("%d°C\n", num2);
        System.out.printf("%o %d %h\n", num3, num3, num3);
        System.out.printf("%d %05d %5d\n", num1, num1, num1);

        System.out.printf("%c %c %c\n", c1, c2, c3);

        System.out.printf("f: %f, %.1f\n", f, f);
        System.out.printf("d: %f, %.4f\n", d, d);
    }
}
