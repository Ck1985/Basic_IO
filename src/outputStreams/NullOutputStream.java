package outputStreams;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class NullOutputStream extends OutputStream {
    private boolean closed = false;
    public void write(int b) throws IOException{
        if (closed) {
            throw new IOException("Write to the closed stream");
        }
    }
    public void write(byte[] data, int offset, int length) throws IOException {
        if (data == null) {
            throw new NullPointerException("data is null");
        }
        if (closed) {
            throw new IOException("Write to the closed stream");
        }
    }
    public void close() {
        this.closed = true;
    }
    public static void main(String[] args) {
        OutputStream output = new NullOutputStream();
        PrintStream ps = new PrintStream(output);
        System.setOut(ps);
        System.setErr(ps);
    }
}
