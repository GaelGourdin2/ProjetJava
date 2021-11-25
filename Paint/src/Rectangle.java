import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure{ // Sous classe de Figure

    public void Rectangle (int px, int py, Color c){ // Constructeur

        Point p = new Point();
        p.Point(px, py);
        Figure(c,p);
    }

    // Définition des méhtodes abstraites de Figure :

    public void draw (Graphics g){
    }

}
