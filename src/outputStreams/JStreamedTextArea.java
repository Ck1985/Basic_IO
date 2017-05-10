package outputStreams;

import java.io.*;
import javax.swing.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class JStreamedTextArea extends JTextArea {
    private OutputStream output = new TextAreaOutputStream();
    public JStreamedTextArea() {
        this(" ",0,0);
    }
    public JStreamedTextArea(String text) {
        this(text,0,0);
    }
    public JStreamedTextArea(int rows, int columns) {
        this(" ",rows,columns);
    }
    public JStreamedTextArea(String text, int rows, int columns) {
        super(text,rows,columns);
        setEditable(false);
    }
    public OutputStream getOutput() {
        return this.output;
    }
    private class TextAreaOutputStream extends OutputStream {
        private boolean closed = false;
        private void checkOpen() throws IOException {
            if (this.closed) {
                throw new IOException("Write to the closed stream !!!");
            }
        }
        public void write(int b) throws IOException {
            checkOpen();
            b = b & 0x000000FF;
            char c = (char)b;
            append(String.valueOf(c));
        }
        public void write(byte[] bytes, int offset, int length)  throws IOException {
            this.checkOpen();
            append(new String(bytes,offset,length));
        }
        public void close() {
            this.closed = true;
        }
    }
}
