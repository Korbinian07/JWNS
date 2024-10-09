import java.awt.Color;
public class PaintableOval extends SimpleOval implements Paintable {
    
    public PaintableOval (Vertex pos, double width, double heigth, Color color) {
        super (pos, width, heigth, color);
    }

    public PaintableOval (double x, double y, double width, double heigth, Color color) {
        this (new Vertex (x, y), width, heigth, color);
    }

    public PaintableOval (double x, double y, double width, double heigth) {
        this (new Vertex (x, y), width, heigth, new Color (0, 0, 0));
    }



    public void paintTo (java.awt.Graphics g) {
        g.setColor (color);
        g.fillOval ((int)pos.x, (int)pos.x, (int)width, (int)heigth);
    }
}
