import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {
    @Override

    public void paintComponent (java.awt.Graphics g) {
       g.fillRect (1, 2, 3, 4);
    }

    public static void main(String [] args) {
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.pack();
        f.setVisible(true);
    }
    


}
