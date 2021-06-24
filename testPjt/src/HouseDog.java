package testPjt.src;

public class HouseDog extends Dog {
    // Method overriding
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(10);
    }
}
