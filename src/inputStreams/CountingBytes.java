package inputStreams;

import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class CountingBytes {
    public static void countByte() {
        // There is a potential bug in this code, because may be more bytes available than array store them

        try {
            byte[] b = new byte[100];
            int offset = 0;
            int available = 0;
            while (offset < b.length) {
                available = System.in.available();
                int byteRead = System.in.read(b,offset,available);
                if (byteRead == -1) {
                    break;
                }
                offset += byteRead;
            }
        } catch (IOException e) {
            System.err.println("Can not read from System.in");
        }
    }
    public static void countByte2() {
        try {
            byte[] b = new byte[System.in.available()];
            int number = System.in.read(b);
        } catch (IOException e) {
            System.err.println("Couldn't read from System.in");
        }
    }
    public static void main(String[] args) {
        countByte();
    }
}
