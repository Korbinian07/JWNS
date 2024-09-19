public class GeometricObject {
    
    public Vertex pos;
    public double width;
    public double heigth;
    
    
    public GeometricObject (Vertex pos, double width, double heigth) {
        this.pos = pos;
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
        this(new Vertex(posx, posy), width, heigth);

    }

    public GeometricObject (Vertex pos, double width) {
        this(pos, width, width);

    }

    public GeometricObject (double width, double heigth) {
        this(0, 0, width, heigth);

    }

    public GeometricObject () {

        this(10, 10);
    }
}

