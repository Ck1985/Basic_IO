package introducing_IO;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class CharDataType {
    public static void main(String[] args) {
        //variable char type can be assigned by using int literals:
        char copyright = 169;
        System.out.println(copyright);
        //variable char type may also be assigned by using char literals, that is character itself enclosed by quotes
        char copyright2 = '©';
        System.out.println(copyright2);
        char copyright3 = '\u00A9';
        System.out.println(copyright3);
    }
}