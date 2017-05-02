package introducing_IO;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class IntegerData {
    public static void main(String[] args) {
        //This is implicit cast from int to byte or short
        // The compiler java treat literal 42 and 24000 are int
        // so 2 assigment use implicit cast....OK
        byte b = 42;
        short s = 24000;
        // But This assigment is not allowed
        int i = 42;
        // byte b = i; Error
        // we must cast explicit from int to byte:
        byte b1 = (byte)i;
        byte byte1 = 23;
        byte byte2 = 50;
        // This assigment is not allowed...byte1 + byte2 are int
        // The addition of 2 variables byte result is int...
        // byte byte3 = byte1 + byte2; Error

    }
}
