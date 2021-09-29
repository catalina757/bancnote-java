import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

//clasa dreptunghi apelata in main() pentru a desena
class Dreptunghi extends JComponent{
  //initializez variabila array de tip int apeland metoda Bancnote() din calasa Main
  int[] nrBancnote = Main.Bancnote();

  //metoda paint() din pachetul java.awt - clasa Graphics / Graphics2D - importate in antetul fisierului
  //in functie de numarul de bancnote de fiecare fel repet desenarea unui dreptunghi, fiecare dreptunghi avand noi coordonate de dimensiune si pozitie, calculate in functie de numarul bancnotelor
  public void paint(Graphics g){
    Graphics2D graph = (Graphics2D) g;

    //coordonate dreptunghi: pozitia pe orizontala - distanta de la margine stanga, pozitia pe verticala - distanta de la margine sus, latime, inaltime
    for (int i = 0; i < nrBancnote[0] ; i++) {
      graph.draw(new Rectangle(5 + i*40, 5, 20, 40));
      graph.setColor(Color.BLUE);  
      graph.fillRect(5 + i*40, 5, 21, 41);
    }

    for (int i = 0; i < nrBancnote[1] ; i++) {
      graph.draw(new Rectangle(5 + i*40, 55, 20, 40));
      graph.setColor(Color.RED);
      graph.fillRect(5 + i*40, 55, 21, 41);
    }

    for (int i = 0; i < nrBancnote[2] ; i++) {
      graph.draw(new Rectangle(5 +i*40, 105, 20, 40));
      graph.setColor(Color.GREEN);
      graph.fillRect(5 + i*40, 105, 21, 41);
    }
  }
}
