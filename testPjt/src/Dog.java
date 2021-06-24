package testPjt.src;

public class Dog extends Animal {
    // default Constructor
    public Dog() {
    }

    public void sleep() {
        System.out.println(this.name + " zzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
