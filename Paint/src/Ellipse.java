import java.awt.Color;
import java.awt.Graphics;


public class Ellipse extends Figure { // Sous classe de Figure

    public void Ellipse (int px, int py, Color c){ // Constructeur
        Point p = new Point();
        p.Point(px, py);
        Figure(c,p);
    }

    // Définition des méhtodes abstraites de Figure :

    public void draw (Graphics g){

    }
}
