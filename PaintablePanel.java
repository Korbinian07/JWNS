import JWNS.src.util.ShowInFrame;
import java.awt.Color;

public class PaintablePanel extends SizedPanel {
    Paintable pa;

    public PaintablePanel (Paintable pa)  {this.pa = pa;}

    public void paintComponent(java.awt.Graphics g) {
        pa.paintTo(g);
    }

    public static void main (String[] args) {
        ShowInFrame.show (new PaintablePanel (new PaintableOval(100, 50, 30, 50)));
        ShowInFrame.show (new PaintablePanel (new PaintableTriangle(200, 200, 40, new Color (70, 120, 170))));
        ShowInFrame.show (new PaintablePanel (new PaintableRectangle(10, 10, 30, 40, new Color (70, 120, 170))));
        ShowInFrame.show (new PaintablePanel (new PaintableOval(10, 10, 30, 70, new Color (70, 120, 170))));
        
    }
}


