package testPjt.src;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("./out.txt"); // 내용 추가시 ("path", true);
        for (int i = 0; i < 10; i++) {
            String data = i + "번째 FileOutputStream\n";
            output.write(data.getBytes());
        }
        output.close();

        FileWriter fw = new FileWriter("./out.txt", true);
        for (int i = 0; i < 10; i++) {
            String data = i + "번째 FileWriter\n";
            fw.write(data);
        }
        fw.close();

        PrintWriter pw = new PrintWriter(new FileWriter("./out.txt", true));
        for (int i = 0; i < 10; i++) {
            String data = i + "번째 PrintWriter";
            pw.println(data);
        }
        pw.close();
    }
}
