package inputStreams;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SkippingBytes {
    public static void main(String[] args) {
        try {
            long numByteSkipped = 0;
            long numBytetoSkip = 80;
            while (numByteSkipped < numBytetoSkip) {
                long n = System.in.skip(numBytetoSkip - numByteSkipped);
                if (n == -1) break;
                numByteSkipped += n;
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
