package ouputStreams;

import java.io.OutputStream;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class AsciiChart {
    public static void main(String[] args) {
        for (int i = 8; i < 127; i++) {
            System.out.write(i);
            if (i % 8 == 0) {
                //System.out.write('\n');
                System.out.write(10);
            } else {
                //System.out.write('\t');
                System.out.write(9);
            }
        }
        //System.out.write('\n');
        System.out.write(10);
    }
}
