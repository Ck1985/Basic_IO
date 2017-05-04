package introducing_IO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SystemErr {
    public static void throwException() throws IOException {}
    public static void main(String[] args) {
        try {
            throwException();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
