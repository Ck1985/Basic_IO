package inputStreams;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ReadChunksOfData {
    public static void readChunksVer1() {
        try {
            byte[] b = new byte[10];
            System.in.read(b);
        } catch (IOException e) {
            System.err.println("Can not read data from System.in");
        }
    }
    public static void readChunksVer2() {
        try {
            byte[] b = new byte[100];
            int offset = 0;
            while (offset < b.length) {
                int byteRead = System.in.read(b, offset, b.length - offset);
                if (byteRead == -1) {
                    break;
                } else {
                    offset += 1;
                }
            }
        } catch (IOException e) {
            System.err.println("Couldn't read System.in stream");
        }
    }
    public static void main(String[] args) {
        readChunksVer1();
        readChunksVer2();
    }
}
