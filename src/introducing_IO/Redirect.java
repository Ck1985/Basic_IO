package introducing_IO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Redirect {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\InputFile.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\OutputFile.txt")));
        char data = (char)System.in.read();
        while (data != -1) {
            System.out.print(data + " ");
            data = (char)System.in.read();
        }
    }
}
