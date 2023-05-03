import javax.swing.*;
import java.awt.*;

public class Bird  extends Thread {

    private int x;
    private int y;
    private boolean isFlying;
    private ImageIcon image;

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
        this.isFlying = true;
    }


    public void run() {
        while (true) {
            if (this.isFlying) {
                this.x++;
            }
        }
    }


    public void draw (Graphics graphics) {


    }
    public void Image(){

    }


}

