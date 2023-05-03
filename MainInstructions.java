import javax.swing.*;
import java.awt.*;

public class MainInstructions extends JPanel {


    private JLabel InstructionsForUser;

    public MainInstructions()
    {
        Utils.setJPanelWindow(this);
        InstructionsForUser = new JLabel("Welcome \n " +
                "Fly the bird as far as you can without hitting a pipe. \n" +
                "Use your spacebar to fly");
        InstructionsForUser.setBounds(this.getX(),this.getY());
        InstructionsForUser.setFont(Constants.myFont);
//        this.InstructionsForUser =CreateNew.newLabel("Welcome \n " +
//                "Fly the bird as far as you can without hitting a pipe. \n" +
//                "Use your spacebar to fly",this.getX(),this.getY());
        this.add(this.InstructionsForUser);
        this.setBackground(Color.magenta);
    }
}
