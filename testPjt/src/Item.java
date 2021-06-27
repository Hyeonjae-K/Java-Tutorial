package testPjt.src;

public class Item {
    private String name, value;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String raw() {
        StringBuffer padded = new StringBuffer(this.value);

        while (padded.toString().getBytes().length < this.length) {
            padded.append(' ');
        }

        return padded.toString();
    }

    public static Item create(String name, int length, String value) {
        Item item = new Item();
        item.setName(name);
        item.setLength(length);
        item.setValue(value);
        return item;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.setName("Name");
        item.setLength(10);
        item.setValue("GilDong");
        System.out.println("[" + item.raw() + "]");
    }
}
