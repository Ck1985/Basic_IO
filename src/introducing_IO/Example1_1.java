package introducing_IO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example1_1 {
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine("Input the number from 1 to 10:");
        int max = Integer.parseInt(input);

        for (int i = 1; i < max; i++) {
            console.printf("%d\n", i*i);
        }
    }
}
