import java.awt.Color;
public class PaintableRectangle extends SimpleRectangle implements Paintable {
    public PaintableRectangle (Vertex pos, double width, double height, Color color) {
        super (pos, width, height, color);
    }
    
    public PaintableRectangle (double x, double y, double width, double height) {
        this (new Vertex (x, y), width, height, new Color (0, 0, 0));
    }

    public PaintableRectangle (double x, double y, double width, double height, Color color) {
        this (new Vertex (x, y), width, height, color);
    }



    public void paintTo (java.awt.Graphics g) {
        g.setColor (color);
        g.fillRect ((int)pos.x, (int)pos.x, (int)width, (int)height);
    }
}

