package outputStreams;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class Switch{
    private boolean state = false;
    public boolean read() {
        return this.state;
    }
    public void on() {
        this.state = true;
        System.out.println(this);
    }
    public void off() {
        this.state = false;
        System.out.println(this);
    }
    public String toString() {
        return state ? "On" : "Off";
    }
}
class OnOffExcaption_1 extends Exception {}
class OnOffException_2 extends Exception {}
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffExcaption_1, OnOffException_2 {}
    public static void main(String[] args) {
        /**
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffExcaption_1 e) {
            System.out.println(e);
            sw.off();
        } catch (OnOffException_2 e) {
            System.out.println(e);
            sw.off();
        }
         */
        try {
            sw.on();
            f();
        } catch (OnOffExcaption_1 e) {
            System.out.println(e);
        } catch (OnOffException_2 e) {
            System.out.println(e);
        } finally {
            sw.off();
        }
    }
}
