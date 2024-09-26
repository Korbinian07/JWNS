public class SimpleSquare  extends GeometricObject {
    public SimpleSquare (Vertex pos, double width) {
        super (pos, width, width);

    }

    public SimpleSquare (double x, double y, double width) {
        super(new Vertex(x, y), width, width);
    }


    @Override public String toString () {
        return "SimpleSquare" + super.toString();
    }
}
