public class Point {
    private int y,x;

    public void PointInit(){ // Constructeur qui initialise le Point
        this.y = 0;
        this.x = 0;
    }

    public void Point(int x, int y){ // Constructeur
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    // Getter/Setter :
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
