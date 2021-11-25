import java.awt.*;

public class Circle extends Ellipse{ // Sous classe de Ellipse

    public void Circle(int px, int py, Color c){ // Constructeur
        Ellipse(px, py, c);
    }

    // La méthode est redéfini car la forme n'est pas la même que pour une ellipse
    public void setBoundingBox (int heightBB, int widthBB){
        if (heightBB == widthBB){
            super.setLength(heightBB);
            super.setWidth(widthBB);
        }
        else{
            System.out.println("La longueur doit être égale à la largeur, C'EST UN CERCLE!");
        }
    }
}
