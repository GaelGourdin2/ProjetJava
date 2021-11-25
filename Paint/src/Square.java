import java.awt.*;

public class Square extends Rectangle{ // Sous classe de Rectangle

    public void Square(int px, int py, Color c){ // Constructeur
        Rectangle(px, py, c);
    }

    // La méthode est redéfini car la forme n'est pas la même que pour un rectangle
    public void setBoundingBox (int heightBB, int widthBB){
        if (heightBB == widthBB){
            super.setLength(heightBB);
            super.setWidth(widthBB);
        }
        else{
            System.out.println("La longueur doit être égale à la largeur, C'EST UN CARRE!");
        }
    }
}
