public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(42, 17);
        Vertex v2 = new Vertex(4, 7.2);
        Vertex v3 = v1.skalarMult(2);
        Vertex v4 = v1.add(v2);
        GeometricObject o1 = new GeometricObject ();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

        System.out.println(v1.length());
        System.out.println(v2.length());
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v1));

    }
}
