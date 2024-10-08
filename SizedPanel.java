import JWNS.src.util.ShowInFrame;
import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel {
    int preferredWidth = 300;
    int preferredHeigth = 400;

    public SizedPanel(int w, int h) {
        preferredWidth = w;
        preferredHeigth = h;
    }

    public SizedPanel() {
    };

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeigth);

    }
    
    public static void main (String [] args) {
        ShowInFrame.show ("ZweiterTest", new SizedPanel ());
    }
}
