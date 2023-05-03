import javax.swing.*;

public class FlappyBird extends JFrame {

    public static void main(String[] args) {
        new FlappyBird();
    }

    public FlappyBird()
    {
        Utils.setJFrameWindow(this,"Flappy Bird Game" );
       this.add(new MenuGame());
       this.add(new MainInstructions());
    }
}
