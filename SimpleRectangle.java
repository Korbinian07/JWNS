public class SimpleRectangle  extends GeometricObject {
    public SimpleRectangle (Vertex pos, double width, double heigth) {
        super (pos, width, heigth);

    }

    public SimpleRectangle (double x, double y, double width, double heigth) {
        super(new Vertex(x, y), width, heigth);
    }


    @Override public String toString () {
        return "SimpleRectangle" + super.toString();
    }


}
