
class Vertex {
    public double x;
    public double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double length() {
        return Math.sqrt(x * x + y * y);

    }

    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }

    public void skalarMultMod(double s){
        x = x * s;
        y = y * s;
    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public Vertex add(Vertex that) {
            return new Vertex (x + that.x, y + that.y);

    }

    public void addMod(Vertex that) {
        x+= that.x;
        y+= that.y;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    

    public double getY(){
        return y;
    }

    public boolean equals (Object thatObject) {
        if (thatObject instanceof Vertex) {
            Vertex that = (Vertex) thatObject;
            return this.x == that.x && this.y == that.y;

        } 
        return false;
    }

    public Vertex sub(Vertex that) {
        return new Vertex(x - that.x, y - that.y);
    }

    public double distance(Vertex that) {
        double x_diff = that.x - this.x;
        double y_diff = that.y - this.y;
        return Math.sqrt(x_diff * x_diff + y_diff * y_diff);

    }

    public void normalize() {
        double factor = this.length();
        x = x / factor;
        y = y / factor;
    }
}

