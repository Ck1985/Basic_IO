package introducing_IO;

import java.io.*;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by anonymous.vn1985@gmail.com
 */

public class ConsoleDemo {
    static class PassWord {
        static boolean verifyOldPassword(String login, char[] password) {
            //Dum methoe.......
            return true;
        }
        static void change(String login, char[] password) {

        }
        public static void processPassword() throws IOException{
            Console console = System.console();
            if (console == null) {
                System.out.println("This device has no Console !");
                System.exit(1);
            }
            String login = console.readLine("Enter your login: ");
            char[] oldPassword = console.readPassword("Enter your old password: ");
            if (verifyOldPassword(login,oldPassword)) {
                boolean match = false;
                char[] newPassword_1, rePassword_1;
                do {
                    newPassword_1 = console.readPassword("Enter new your password: ");
                    rePassword_1 = console.readPassword("ReEnter new your password: ");
                    match = Arrays.equals(newPassword_1, rePassword_1);
                    if (match) {
                        change(login, newPassword_1);
                        console.format("Old password's %s changed to new password successful. %n", login);
                    } else {
                        console.format("Creating new password has not successful. Recreating password. %n");
                    }
                    Arrays.fill(newPassword_1, ' ');
                    Arrays.fill(rePassword_1, ' ');
                } while (!match);
            }
            Arrays.fill(oldPassword, ' ');
        }
    }
    public static void readLineVer1() {
        Console console = null;
        String line = null;
        try {
            console = System.console();
            if (console != null) {
                line = console.readLine();
                System.out.println("The Result: " + line);
            }
        } catch(IOError e) {
            e.printStackTrace();
        }
    }
    public static void readLineVer2() {
        Console console = null;
        String line = null;
        try {
            console = System.console();
            if (console != null) {
                line = console.readLine("Hi %s, How are you ? %n" +
                "I known your information: Your age: %d, weight: %f. You like prograaming: %b", "anonymous", 31, 70.5f, true);
                System.out.println("The result: " + line);
            }
        } catch (IOError error) {
            error.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException{
        //readLineVer1();
        //readLineVer2();
        PassWord.processPassword();
    }
}
