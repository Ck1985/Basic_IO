package inputStreams;

import java.io.*;
import java.util.Arrays;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ReadMethodDemo {
    public static void main(String[] args) throws IOException{
        /**
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = System.in.read();
        }
        System.out.println(Arrays.toString(data));
         */

        byte[] bytes = new byte[10];
        int[] convert = new int[10];
        int index = 0;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)System.in.read();
            if (bytes[i] < 0) {
                convert[index++] = bytes[i] + 256;
            } else {
                convert[index++] = bytes[i];
            }
        }
        System.out.println(Arrays.toString(convert));
    }
}
