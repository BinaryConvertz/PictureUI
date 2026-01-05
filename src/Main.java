import javax.swing.*;
import java.awt.*;


void Close(JFrame frame) {

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void main() throws MalformedURLException, URISyntaxException {

    UtilsClass m =new UtilsClass();
    m.ImageSrc(new URI("https://avatars.githubusercontent.com/u/198405425?v=4"));
    ArrayList<Integer> positions = new ArrayList<>();
    positions.add(90 * 5);
    positions.add(100 * 5);

    JFrame frame = new JFrame("Valued App");
    for(int _ : positions) {
        frame.setSize(new Dimension(positions.getFirst(), positions.getLast()));
    }

    Close(frame);
    frame.setVisible(true);
}

