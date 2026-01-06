import javax.swing.*;
import java.awt.*;


void Close(JFrame frame) {

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


void main() throws MalformedURLException, URISyntaxException {

   URI urlLink = WebClients.GetServerClient(URI.create
            ("https://avatars.githubusercontent.com/u/198405425?v=4").toURL());
    ArrayList<Integer> positions = new ArrayList<>();
    positions.add(90 * 5);
    positions.add(90 * 2);

    ImageIcon icon = new ImageIcon(urlLink.toURL());
    JFrame frame = new JFrame("Valued App");
    JLabel label = new JLabel(icon);
    JPanel panel = new JPanel(new FlowLayout());
    JPanel p = new JPanel();
    JPanel lPanel = new JPanel(new FlowLayout());
    JPanel panel1 = new JPanel(new FlowLayout());

    for(int _ : positions) {
        label.setIcon(icon);

        frame.setSize(
                new Dimension (
                        positions.getFirst() - 80,
                        positions.getLast() * 4
                )
        );
    }

    frame.setLayout(new FlowLayout());
    frame.add(panel);
    p.add(new JLabel(new UppercasePointer(new GHPrinter().getName()).Names()), BorderLayout.NORTH);

    JLabel labelGit = new JLabel(
            new GHPrinter().VersionString()
                    + new GHPrinter().VERSION(1.0f));

     frame.add(p);

     new ElementsDraw().addElement(frame, label, lPanel, panel1, labelGit);

     frame.setResizable(false);
     frame.setVisible(true);
     Close(frame);
}
