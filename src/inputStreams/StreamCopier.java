package inputStreams;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class StreamCopier {
    public static void copy(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[1024];
        while (true) {
            int bytesRead = input.read(buffer);
            if (bytesRead == -1) break;
            output.write(buffer,0,bytesRead);
        }
    }
    public static void main(String[] args) {
        try {
            copy(System.in, System.out);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
