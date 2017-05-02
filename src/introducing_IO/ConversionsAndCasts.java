package introducing_IO;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ConversionsAndCasts {
    public static void main(String[] args) {
        /**
        //Trong he co so 2 binary: dang int duoc the hien bang 32 bit
        128 = 0000 0000 0000 0000 0000 0000 1000 0000
// Viet ngan gon lai, theo dang byte (the hien boi 8 bit)
        128 = 1000 0000
        0111 1111
        add           1
        1000 0000
        sau khi thuc hien phep bu cua 2 (2's complement) ta duoc ket qua
        1000 0000.
        Day cung chinh la su the hien nhi phan cua -128 (co bit dau tien la 1)
// nhan xet: khi thuc hien Casting tu int thanh byte nhung bit cao se bi chat cut di
//chi giu lai nhung bit thap.
// kl: vay neu chi la kieu byte (8 bit) thi 1000 0000 phai la -128
// suy ra: int i = 128;
        byte b = (byte)i = -128;
         */

        int i = -130;
        byte b = (byte)i;
        System.out.println(b);
    }
}
