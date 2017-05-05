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
        Console console = null;
        String line = null;
        try {
            console = System.console();
            if (console != null) {
                line = console.readLine("Hi %s, How are you ? %n" +
                "I known your information: Your age: %d, weight: %f. You like prograaming: %b", "anonymous", 31, 70.5f, true);
                System.out.println("The result: " + line);
            }
        } catch (IOError error) {
            error.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //readLineVer1();
        readLineVer2();
    }
}
