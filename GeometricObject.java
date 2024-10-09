import java.awt.Color;

public class GeometricObject {
    
    public Vertex pos;
    public double width;
    public double heigth;
    public Color color;
    
    public GeometricObject (Vertex pos, double width, double heigth, Color color) {
        this.pos = pos;
        this.color = color;

        if (width <= 0) {
            this.width = Math.abs(width);
            this.pos.x = this.pos.x - this.width;
        }
        else {
            this.width = width;
        }

        if (heigth <= 0) {
            this.heigth = Math.abs(heigth);
            this.pos.y = this.pos.y - this.heigth;
        }
        else {
            this.heigth = heigth;
        }
        
        this.pos = pos;
        this.width = width;
        this.heigth = heigth;


    }

    public GeometricObject (double posx, double posy, double width, double heigth) {
        this(new Vertex(posx, posy), width, heigth, new Color (0, 0, 0));

    }

    public GeometricObject (Vertex pos, double width, Color color) {
        this(pos, width, width, color);

    }

    public GeometricObject (double width, double heigth) {
        this(0, 0, width, heigth);

    }

    public GeometricObject (double x) {
        this (x, x);
    }

    public GeometricObject () {
        this(10, 10);
    }

    public double circumference () {
        return 2 * (heigth + width);
    }

    public double area () {
        return heigth * width;
    }

    public boolean contains (Vertex  v) {
        return v.x >= pos.x && v.x <= pos.x + width && v.y >= pos.y && v.y <= pos.y + heigth;
    }

    public boolean isLargerAs (GeometricObject that) {
        return this.area () > that.area ();
    }

    public void moveTo (Vertex v) {
        pos = v;
    } 

    public void moveTo (double x, double y) {
        moveTo (new Vertex (x, y));                                                                                 
    }

    public void move (Vertex v) {
        moveTo (pos.add (v));
    }

    public boolean equals (GeometricObject thatObject) {
        if (thatObject instanceof GeometricObject) {
            GeometricObject that = (GeometricObject) thatObject;
            return pos.equals (that.pos) &&
            that.width == this.width &&
            that.heigth == this.heigth;
        }
        return false;
        
    }

    public String toString () {
        return "pos: " + pos + " w: " + width + " h: " + heigth;
    }                                                                                                   
}                                                                                                                                                                                                                                                                

