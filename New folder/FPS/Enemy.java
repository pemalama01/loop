import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Enemy extends JPanel {
    Random randomNumber = new Random();
    int x = randomNumber.nextInt(500);
    int y= 0;
    Image image;
    
    Enemy(){
        try {
            image = ImageIO.read(new File("./pic.png"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
      g.drawImage(image, x, y,500,500)
      }
      
      public void update() {
        y = y + 1;
      }
}
