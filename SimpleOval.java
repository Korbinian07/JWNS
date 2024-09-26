public class SimpleOval  extends GeometricObject {
    public SimpleOval (Vertex pos, double width, double heigth) {
        super (pos, width, heigth);


    }


    public SimpleOval (double x, double y, double width, double heigth) {
        super(new Vertex(x, y), width, heigth);
    }


    @Override public String toString () {
        return "SimpleOval" + super.toString();
    }


}
