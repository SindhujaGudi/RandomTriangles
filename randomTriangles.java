import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JFrame;

public class randomTriangles extends JFrame {
   
   private static final long serialVersionUID = 1L;
   private Graphics g;
   private Polygon poly;
   int a = 0, b = 0, c = 0, x = 0, y = 0, z = 0;
   Random randomGenerator = new Random();

   public randomTriangles()

   {

       System.out.println("Random Traiangles");

       init(); 

       setSize(600, 600); 

       setVisible(true); 

   }

   public void init() {
       g = getGraphics();

   } // method init

   public static void main(String[] args) {
       new randomTriangles();
   }

   public void paint(Graphics g) {

       for (int i = 0; i < 500; i++) {

           int red = randomGenerator.nextInt(256);
           int green = randomGenerator.nextInt(256);
           int blue = randomGenerator.nextInt(256);
           Color randomColour = new Color(red, green, blue);
           Dimension d = getSize();
          
           a = (int) (Math.random() * d.width);
           b = (int) (Math.random() * d.width);
           c = (int) (Math.random() * d.width);
           x = (int) (Math.random() * d.height);
           y = (int) (Math.random() * d.height);
           z = (int) (Math.random() * d.height);

           g.setColor(randomColour);
           int[] xList = { a, b, c };
           int[] yList = { x, y, z };
           poly = new Polygon(xList, yList, 3);
           g.fillPolygon(poly);
       }
   }
}
