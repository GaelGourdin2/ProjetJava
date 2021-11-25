import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Fenetre extends JFrame implements ActionListener{

    JButton Noir, Rouge, Vert, Bleu, Jaune, Rose, Magenta, Orange, Ellipse, Rectangle, Square, Circle;
    Drawing draw = new Drawing();

    public void InterfaceGraphique(){

        this.setTitle("Paint"); // Titre de la fenetre
        this.setSize(800,600); // Taille de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme le programme quand on clique sur la croix

        // Création et ajout des différents bouttons de l'interface :
        Noir = new JButton("Noir"); Noir.setBackground(Color.BLACK);
        Rouge = new JButton("Rouge"); Rouge.setBackground(Color.RED);
        Vert = new JButton("Vert"); Vert.setBackground(Color.GREEN);
        Bleu = new JButton("Bleu"); Bleu.setBackground(Color.BLUE);
        Jaune = new JButton("Jaune"); Jaune.setBackground(Color.YELLOW);
        Rose = new JButton("Rose"); Rose.setBackground(Color.PINK);
        Magenta = new JButton("Magenta"); Magenta.setBackground(Color.MAGENTA);
        Orange = new JButton("Orange"); Orange.setBackground(Color.ORANGE);
        Ellipse = new JButton("Ellipse");
        Rectangle = new JButton("Rectangle");
        Square = new JButton("Square");
        Circle = new JButton("Circle");

        // Affichage des boutons
        Container contentPanel1 = this.getContentPane();

        JPanel southPanel1 = new JPanel();

        southPanel1.setLayout(new GridLayout(2,6)); // Quadrillage de 2 lignes et 6 colonnes contenants les boutons

        // Ajoute les boutons au panel
        southPanel1.add(Noir); Noir.addActionListener(this); // permet d'associer une action à un bouton
        southPanel1.add(Rouge); Rouge.addActionListener(this);
        southPanel1.add(Vert); Vert.addActionListener(this);
        southPanel1.add(Bleu); Bleu.addActionListener(this);
        southPanel1.add(Jaune); Jaune.addActionListener(this);
        southPanel1.add(Rose); Rose.addActionListener(this);
        southPanel1.add(Magenta); Magenta.addActionListener(this);
        southPanel1.add(Orange); Orange.addActionListener(this);
        southPanel1.add(Rectangle); Rectangle.addActionListener(this);
        southPanel1.add(Ellipse); Ellipse.addActionListener(this);
        southPanel1.add(Square); Square.addActionListener(this);
        southPanel1.add(Circle); Circle.addActionListener(this);

        contentPanel1.add(southPanel1,"South");

        // Menu déroulant
        Container container = this.getContentPane();

        JMenuBar m= new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenu menuAuthors = new JMenu("Authhors");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem nouveau = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");

        JMenuItem Creator = new JMenuItem("Creator");

        menuFile.add(open);
        menuFile.add(nouveau);
        menuFile.add(save);
        menuFile.add(quit);

        menuAuthors.add(Creator);

        m.add(menuFile);
        m.add(menuAuthors);

        container.add(m,"North");

        this.setVisible(true); // permet d'afficher la fenetre

    }

    public static void main (String args[]){
        Fenetre win = new Fenetre();
        win.InterfaceGraphique();
    }

    public void actionPerformed(ActionEvent e){ // Décrit les actions pour chaque élément de la fenetre

        String cmd = e.getActionCommand();

        switch (cmd){
            case "Noir" : draw.setCouleur(Color.BLACK);
                break;

            case "Rouge" : draw.setCouleur(Color.red);
                break;

            case "Vert" : draw.setCouleur(Color.green);
                break;

            case "Bleu" : draw.setCouleur(Color.blue);
                break;

            case "Jaune" : draw.setCouleur(Color.yellow);
                break;

            case "Rose" : draw.setCouleur(Color.pink);
                break;

            case "Magenta" : draw.setCouleur(Color.magenta);
                break;

            case "Orange" : draw.setCouleur(Color.orange);
                break;

            case "Rectangle" : draw.setNameFigure("Rectangle");
                break;

            case "Ellipse" : draw.setNameFigure("Ellipse");
                break;

            case "Square" : draw.setNameFigure("Square");
                break;

            case "Circle" : draw.setNameFigure("Circle");
                break;

            case "Creator" : JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog( info, "Authors : Gaël", "information",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
