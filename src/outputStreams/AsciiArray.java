package outputStreams;

import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class AsciiArray {
    public static void main(String[] args) {
        String s = "How are streams treating you ?";
        byte[] data = s.getBytes();
        //System.out.write(data);
        System.out.println("-------------------------");
        byte[] b = new byte[(127 - 31) * 2];
        int index = 0;
        for (int i = 32; i < 127; i++) {
            b[index++] = (byte)i;
            if (i % 8 == 0) {
                b[index++] = (byte)'\n';
            } else {
                b[index++] = (byte)'\t';
            }
        }
        b[index++] = (byte)'\n';
        try {
            System.out.write(b);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
