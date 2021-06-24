package testPjt.src;

class Updater {
    public void update(int count) {
        count++;
    }

    public void update2(CallbyvalueClass cls) {
        cls.count++;
    }
}

public class CallbyvalueClass {
    int count = 0;

    public static void main(String[] args) {
        CallbyvalueClass mc = new CallbyvalueClass();
        Updater mu = new Updater();
        System.out.println(mc.count);
        mu.update(mc.count);
        System.out.println(mc.count);
        mu.update2(mc);
        System.out.println(mc.count);
    }
}
