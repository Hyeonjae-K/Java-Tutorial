package testPjt.src;

public class MethodClass {
    int public_num = 0;

    public int sum(int a, int b) {
        return a + b;
    }

    public void sum2(int a, int b) {
        System.out.println(a + b);
    }

    public String sayHi() {
        return "Hi";
    }

    public void sayHi2() {
        System.out.println("Hi");
    }

    public void sayNick(String nick) {
        if (nick.equals("fool")) {
            return;
        }
        System.out.println(nick);
    }

    public void vartest(int a) {
        a++;
    }

    public int vartest2(int a) {
        return ++a;
    }

    public void vartest3(MethodClass mc) {
        mc.public_num++;
    }

    public void vartest4() {
        this.public_num++;
    }

    public static void main(String[] args) {
        MethodClass mc = new MethodClass();
        int a = 3, b = 4;

        System.out.println(mc.sum(a, b));
        mc.sum2(a, b);
        System.out.println(mc.sayHi());
        mc.sayHi2();

        mc.sayNick("fool");
        mc.sayNick("cool");

        mc.vartest(a);
        System.out.println(a);
        a = mc.vartest2(a);
        System.out.println(a);

        MethodClass mc2 = new MethodClass();
        System.out.println(mc.public_num + " " + mc2.public_num);
        mc.vartest3(mc);
        System.out.println(mc.public_num + " " + mc2.public_num);
        mc.vartest3(mc2);
        System.out.println(mc.public_num + " " + mc2.public_num);
        mc.vartest4();
        System.out.println(mc.public_num + " " + mc2.public_num);
        mc2.vartest4();
        System.out.println(mc.public_num + " " + mc2.public_num);
    }
}
