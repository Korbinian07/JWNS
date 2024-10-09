import java.awt.Color;
;public class SimpleRectangle  extends GeometricObject {
    public SimpleRectangle (Vertex pos, double width, double heigth, Color color) {
        super (pos, width, heigth, color);

    }

    public SimpleRectangle (double x, double y, double width, double heigth, Color color) {
        this(new Vertex(x, y), width, heigth, new Color (0, 0, 0));
    }


    @Override public String toString () {
        return "SimpleRectangle" + super.toString();
    }


}
