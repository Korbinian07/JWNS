public class GeometricObject {
    
    public Vertex pos;
    public double width;
    public double heigth;
    
    
    public GeometricObject (Vertex pos, double width, double heigth) {
        
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
}
