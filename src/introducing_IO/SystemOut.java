package introducing_IO;

import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SystemOut {
    public static void main(String[] args) throws IOException{
        byte[] hello = new byte[]{72,101,108,108,111,32,119,111,114,108,100};
        System.out.write(hello);
    }
}
