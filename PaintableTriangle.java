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



    public void paintTo(java.awt.Graphics g) {
        g.setColor(color);
        
        // Berechnung der drei Eckpunkte des Dreiecks
        int[] xPoints = {
            (int) pos.x, // Startpunkt
            (int) (pos.x + width / 2), // Spitze des Dreiecks
            (int) (pos.x - width / 2)  // Rechter Eckpunkt
        };
        
        int[] yPoints = {
            (int) pos.y, // Startpunkt
            (int) (pos.y - Math.sqrt(3) / 2 * width), // Spitze
            (int) pos.y // Rechter Eckpunkt
        };
        
        // Zeichne das Dreieck
        g.fillPolygon(xPoints, yPoints, 3);
    }
    
}
