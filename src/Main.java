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
    positions.add(100 * 5);

    ImageIcon icon = new ImageIcon(urlLink.toURL());
    JFrame frame = new JFrame("Valued App");
    for(int _ : positions) {
        frame.setSize(new Dimension(positions.getFirst(), positions.getLast()));
        frame.add(new JLabel(icon));
        frame.pack();
    }


    Close(frame);
    frame.setVisible(true);
}

