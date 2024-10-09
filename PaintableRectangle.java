import java.awt.Color;
public class PaintableRectangle extends SimpleRectangle implements Paintable {
    public PaintableRectangle (Vertex pos, double width, double heigth, Color color) {
        super (pos, width, heigth, color);
    }
    
    public PaintableRectangle (double x, double y, double width, double heigth) {
        this (new Vertex (x, y), width, heigth, new Color (0, 0, 0));
    }

    public PaintableRectangle (double x, double y, double width, double heigth, Color color) {
        this (new Vertex (x, y), width, heigth, color);
    }



    public void paintTo (java.awt.Graphics g) {
        g.setColor (color);
        g.fillRect ((int)pos.x, (int)pos.x, (int)width, (int)heigth);
    }
}

