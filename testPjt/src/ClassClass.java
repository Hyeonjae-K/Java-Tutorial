package testPjt.src;

public class ClassClass {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ClassClass cat = new ClassClass(), dog = new ClassClass();
        System.out.println(cat.name + ", " + dog.name);

        cat.setName("Meow");
        dog.setName("Bowwow");
        System.out.println(cat.name + ", " + dog.name);

        cat.name = "cat name";
        dog.name = "dog name";
        System.out.println(cat.name + ", " + dog.name);
    }
}