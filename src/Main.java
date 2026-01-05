import javax.swing.*;
import java.awt.*;


void Close(JFrame frame) {

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void main() throws MalformedURLException, URISyntaxException {

   URI urlLink = HttpClients.GetServerClient(URI.create
            ("https://avatars.githubusercontent.com/u/198405425?v=4").toURL());
    ArrayList<Integer> positions = new ArrayList<>();
    positions.add(90 * 5);
    positions.add(90 * 2);

    ImageIcon icon = new ImageIcon(urlLink.toURL());
    JFrame frame = new JFrame("Valued App");
    JLabel label = new JLabel(icon);
    JPanel panel = new JPanel(new FlowLayout());
    JPanel p = new JPanel();

    for(int _ : positions) {
        label.setIcon(icon);

        frame.setSize(new Dimension(
                positions.getFirst() - 80, positions.getLast() * 4));
    }

    frame.setLayout(new FlowLayout());
    frame.add(panel);
    p.add(new JLabel(new Box(new GithubNameInfo().getName()).Names()), BorderLayout.NORTH);
    frame.add(p);

//    frame.add(label_2);
    frame.add(label);
    frame.setResizable(false);

    frame.setVisible(true);
    Close(frame);
}

