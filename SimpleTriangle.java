import java.awt.Color;
;public class SimpleTriangle  extends GeometricObject  {
    public SimpleTriangle (Vertex pos, double width, Color color) {
        super (pos, width, (Math.sqrt(3) / 2) * width, color);
        
    }

    public SimpleTriangle (double x, double y, double width, Color color) {
        this(new Vertex(x, y), width, new Color (0, 0, 0));
    }

    @Override public String toString () {
        return "SimpleTriangle" + super.toString();
    }

    public double circumference () {
        return 3 * width;
    }   
    
    public double area () {
        return 1 / 2 * width * height;
    }

}
