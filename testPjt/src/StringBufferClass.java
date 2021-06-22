package testPjt.src;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // 문자열을 추가하거나 변경할 때 사용하는 자료형
        sb.append(" ");
        sb.append("jump to java");
        sb.insert(0, "hello");
        System.out.println(sb);
        System.out.println(sb.substring(14));

        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);

        System.out.println(sb.equals(temp));
        System.out.println((sb.toString().equals(temp)));
        // toString() -> String 자료형으로 변경
    }
}
