package testPjt.src;

public class HouseDog extends Dog {
    // Constructor
    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yourkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    // Method overriding
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("temp");
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(10);

        HouseDog dog = new HouseDog("constructor name");
        HouseDog bulldog = new HouseDog(2);
        HouseDog yourkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yourkshire.name);
        System.out.println(bulldog.name);
    }
}
