package inputStreams;

import java.io.*;
import java.net.URL;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ClosingInputStream {
    public static void main(String[] args) {
        InputStream input = null;
        try {
            URL url = new URL("http://google.com.vn");
            input = url.openStream();
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
