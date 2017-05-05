package introducing_IO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */

public class ConsoleDemo {
    public static void readLineVer1() {
        Console console = null;
        String line = null;
        try {
            console = System.console();
            if (console != null) {
                line = console.readLine();
                System.out.println("The Result: " + line);
            }
        } catch(IOError e) {
            e.printStackTrace();
        }
    }
    public static void readLineVer2() {

    }
    public static void main(String[] args) {

    }
}
