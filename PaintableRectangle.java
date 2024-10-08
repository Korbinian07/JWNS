public class PaintableRectangle extends SimpleRectangle implements Paintable {
    public PaintableRectangle (double x, double y, double width, double heigth) {
        super(x, y, width, heigth);
    }



    public void paintTo (java.awt.Graphics g) {
        g.fillRect ((int)pos.x, (int)pos.x, (int)width, (int)heigth);
    }
}

