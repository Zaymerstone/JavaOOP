import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class JImageDisplay extends JComponent {
    private final BufferedImage img;
    //Конструктор для управления изображением, содержимое которого нужно записать
    public JImageDisplay(int w, int h) {
        img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Dimension dim = new Dimension(w, h);
        super.setPreferredSize(dim);
    }

    public BufferedImage getImage(){
        return img;
    }

    public void  setPreferredSize(Dimension preferredSize){
        super.setPreferredSize(preferredSize);
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        g.drawImage(img,0,0,img.getWidth(),img.getHeight(),null);
    }
    public void clearImage(){
        int[] blankArray = new int[getHeight()*getWidth()];
        img.setRGB(0,0,getWidth(),getHeight(),blankArray,0,1);
    }

    public void drawPixel(int x, int y, int rgbColor){
        img.setRGB(x,y,rgbColor);

    }
}
