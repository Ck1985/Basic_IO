package outputStreams;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ClosingOutputStreams {
    public static void main(String[] args) {
        //This code fragment has a potential leak ......
        //Because The IOException can be thrown while writing....
        /**
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\FileClosed.txt");
            //Try write to this output stream....
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         */

        //We should close the stream in finally block so that it 's closed whether or not an exception is thrown
        OutputStream output = null;
        try {
            output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\FileClosed.txt");
            //Write something to this output stream.....
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
