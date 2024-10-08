public class PaintableTriangle extends SimpleTriangle implements Paintable {
    public PaintableTriangle (double x, double y, double width) {
        super(x, y, width);
    }



    public void paintTo (java.awt.Graphics g) {
        g.fillTriangle ((int)pos.x, (int)pos.x, (int)width);
    }
}
