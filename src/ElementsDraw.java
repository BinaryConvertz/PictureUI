import javax.swing.*;

public class ElementsDraw {
    void addElement(JFrame frame, JLabel label, JPanel lPanel, JPanel panel1, JLabel labelGit) {

        frame.add(label);
        frame.add(lPanel);
        frame.add(panel1);
        panel1.add(labelGit);

    }
}
