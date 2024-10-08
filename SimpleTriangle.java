public class SimpleTriangle  extends GeometricObject  {
    public SimpleTriangle (Vertex pos, double width) {
        super (pos, width, (Math.sqrt(3) / 2) * width);
        
    }

    public SimpleTriangle (double x, double y, double width) {
        super(new Vertex(x, y), width);
    }

    @Override public String toString () {
        return "SimpleTriangle" + super.toString();
    }

    public double circumference () {
        return 3 * width;
    }   
    
    public double area () {
        return 1 / 2 * width * heigth;
    }

}
