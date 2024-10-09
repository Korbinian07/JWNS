import java.awt.Color;

public class SimpleSquare  extends GeometricObject {
    public SimpleSquare (Vertex pos, double width, Color color) {
        super (pos, width, width, color);

    }

    public SimpleSquare (double x, double y, double width, Color color) {
        this (new Vertex(x, y), width, width, new Color (0, 0, 0));
    }



    @Override public String toString () {
        return "SimpleSquare" + super.toString();
    }
}
