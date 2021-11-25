import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {
    private Color couleur;
    private ArrayList<Figure> list = new ArrayList<>();
    private String nameFigure;
    private int x, y;

    public void Drawing(){ // Constructeur
        this.x = 0;
        this.y = 0;
        this.setBackground(Color.white);
        Rectangle rectangle = new Rectangle();
        rectangle.Rectangle(0,0,Color.black);
        this.list.add(rectangle);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    // Calcule la taille de la figure en fonction des déplacement de la souris
    public void mouseDragged(MouseEvent e){
        this.list.get(this.list.size() - 1).setBoundingBox(e.getX() - this.x, e.getY() - this.y);
    }

    public void mousePressed(MouseEvent e){

        // Récupèere les coordonnées de la souris
        this.x = e.getX();
        this.y = e.getY();

        Rectangle rectangle = new Rectangle();
        rectangle.Rectangle(x,y,couleur);
        Square square = new Square();
        square.Square(x,y,couleur);
        Ellipse ellipse = new Ellipse();
        ellipse.Ellipse(x,y,couleur);
        Circle circle = new Circle();
        circle.Circle(x,y,couleur);

        // Ajoute la figure selectionnée à la liste en enregistrant son origine et sa couleur
        switch (nameFigure){
            case "Rectangle" : list.add(rectangle);
                break;

            case "Ellipse" : list.add(ellipse);
                break;

            case "Square" : list.add(square);
                break;

            case "Circle" : list.add(circle);
                break;
        }

    }

    // On doit redéfinir les methodes de la classe MouseListener

    public void mouseMoved(MouseEvent e){

    }

    public void mouseClicked(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
}
