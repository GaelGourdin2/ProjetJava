import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure {

    private Point origine; // Point en haut à gauche de la figure
    private Color couleur;
    private int length = 0, width = 0;

    public void Figure(Color couleur, Point p){ // Constructeur
        this.couleur = couleur;
        this.origine = p;
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.length = heightBB;
        this.width = widthBB;
    }
    // Méthodes absraites à redéfinir dans les sous classes :

    public abstract void draw (Graphics g);

    @Override
    public String toString() {
        return "Figure {" +
                "origine = " + origine +
                ", couleur = " + couleur +
                ", length = " + length +
                ", width = " + width +
                '}';
    }

    // Getter/Setter :
    public Point getOrigine() {
        return origine;
    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

