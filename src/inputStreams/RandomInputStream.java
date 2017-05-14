package inputStreams;

import java.util.Random;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */

public class RandomInputStream extends InputStream {
    private static Random generator = new Random();
    private boolean closed = false;
    private void checkOpen() throws IOException {
        if (closed) throw new IOException("This input stream is closed");
    }
    public void close() {
        this.closed = true;
    }
    public int read() throws IOException {
        this.checkOpen();
        int result = generator.nextInt() % 256;
        if (result >= 0) {
            return result;
        } else {
            return -result;
        }
    }
    public int read(byte[] b, int offset, int len) throws IOException {
        this.checkOpen();
        byte[] tempRead = new byte[len];
        generator.nextBytes(tempRead);
        System.arraycopy(tempRead, 0, b, offset, len);
        return len;
    }
    public int read(byte[] b) throws IOException {
        this.checkOpen();
        generator.nextBytes(b);
        return b.length;
    }
    public long skip(long n) throws IOException {
        this.checkOpen();
        return n;
    }
    public int available() throws IOException {
        return Integer.MAX_VALUE;
    }
}
