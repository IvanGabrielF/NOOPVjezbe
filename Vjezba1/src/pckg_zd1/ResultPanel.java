package pckg_zd1;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    private JTextArea textArea;

    public ResultPanel() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void clearText() {
        textArea.setText("");
    }
}
