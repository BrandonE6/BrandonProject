package CampusGame;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Character {
    
    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int width;
    private int height;
    private Image image;
    Options option;
    public Character() {
        
        loadImage();
       option = new Options();   
    }

    public void loadImage() {
        
        ImageIcon ii = new ImageIcon(getClass().getResource("/resources/Student.JPG"));
        image = ii.getImage(); 
        width = image.getWidth(null);
        height = image.getHeight(null);
        
    }

    public void move() {
        
        x += dx;
        y += dy;
    }

    public int getX() {
        
        return x;
    }

    public int getY() {
        
        return y;
    }
    
    public int getWidth() {
        
        return width;
    }
    
    public int getHeight() {
        
        return height;
    }    

    public Image getImage() {
        
        return image;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void keyPressed(KeyEvent e) {
System.out.println(option.isMascotSelected);
System.out.println(option.isProfessorSelected);
System.out.println(option.isStudentSelected);
        
        int key = e.getKeyCode();
        
        //Check Left bound movement speed
        if (key == KeyEvent.VK_LEFT && option.isProfessorSelected == true) {
            dx = -1;
            System.out.println("Professor Left");
        }
        else if (key == KeyEvent.VK_LEFT && option.isStudentSelected == true){
           dx = -3;
           System.out.println("Student Left");
        }
        else if (key == KeyEvent.VK_LEFT && option.isMascotSelected == true){
            dx = -2;
            System.out.println("Mascot Left");
        }  
        
        //Check right bound movement speed
        if (key == KeyEvent.VK_RIGHT && option.isProfessorSelected == true) {
            dx = 1;
        }
        if (key == KeyEvent.VK_RIGHT && option.isStudentSelected == true) {
            dx = 3;
        }
        if (key == KeyEvent.VK_RIGHT && option.isMascotSelected == true) {
            dx = 2;
        }  
        //Check upward movement speed
        if (key == KeyEvent.VK_UP && option.isProfessorSelected == true) {
            dy = -1;
        }
        if (key == KeyEvent.VK_UP && option.isStudentSelected == true) {
            dy = -3;
        }
        if (key == KeyEvent.VK_UP && option.isMascotSelected == true) {
            dy =-2;
        }
       

       
        //Check downward movement speed
        if (key == KeyEvent.VK_DOWN && option.isProfessorSelected == true) {
            dy = 1;
        }
        if (key == KeyEvent.VK_DOWN && option.isStudentSelected == true) {
            dy =3;
        }
        if (key == KeyEvent.VK_DOWN && option.isMascotSelected == true) {
            dy = 2;
        }
        
    }
    //Stop movement
    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    
}
