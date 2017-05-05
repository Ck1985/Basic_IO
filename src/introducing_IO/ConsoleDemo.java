package introducing_IO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = null;
        String line = null;
        try {
            console = System.console();
            if (console != null) {
                line = console.readLine("Input the line data: ");
                System.out.println("The result: " + line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
