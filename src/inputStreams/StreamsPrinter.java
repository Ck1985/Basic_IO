package inputStreams;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class StreamsPrinter {
    public static void main(String[] args) {
        try {
            while (true) {
                int datum = System.in.read();
                if (datum == -1) break;
                System.out.println(datum);
            }
        } catch (IOException e) {
            System.err.println("Couldn't read from System.in");
        }
    }
}
