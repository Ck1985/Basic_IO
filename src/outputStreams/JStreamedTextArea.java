package outputStreams;

import java.io.*;
import javax.swing.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class TextAreaOutputStream extends OutputStream {

}
public class JStreamedTextArea extends JTextArea {
    private OutputStream output = new TextAreaOutputStream();
    public JStreamedTextArea() {
        super(" ", 0, 0);
    }
}
