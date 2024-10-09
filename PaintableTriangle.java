import java.awt.Color;

public class PaintableTriangle extends SimpleTriangle implements Paintable {
    public PaintableTriangle (Vertex pos, double width, Color color) {
        super(pos, width, color);
    }

    public PaintableTriangle (double x, double y, double width) {
        this (new Vertex (x, y), width, new Color (0, 0, 0));
    }

    public PaintableTriangle (double x, double y, double width, Color color) {
        this (new Vertex (x, y), width, color);
    }



    public void paintTo (java.awt.Graphics g) {
        g.setColor (color);
        g.fill ((int)pos.x, (int)pos.x, (int)width);
    }
}
