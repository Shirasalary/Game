import javax.swing.*;

public class MenuGame extends JPanel {

    private JLabel titleLabel;

    private JButton gameInstructionsButton;

    private JButton startGameButton;

    public MenuGame(){

        Utils.setJPanelWindow(this);
        this.titleLabel = Utils.newLabel("Flappy Bird",(this.getX() + Constants.WINDOW_WIDTH /2) -(Constants.LABEL_WIDTH/2),
                this.getY() + (Constants.WINDOW_HEIGHT /4));
        this.gameInstructionsButton = Utils.newButton("Instruction",this.titleLabel.getX()-Constants.BUTTON_WIDTH,this.getY()+(Constants.WINDOW_HEIGHT /4)*3);
        this.startGameButton = Utils.newButton("Start",this.titleLabel.getX()+Constants.LABEL_WIDTH,this.gameInstructionsButton.getY());

        this.gameInstructionsButton.addActionListener((e) -> {
            MainInstructions instructions = new MainInstructions();
           Utils.switchPanels(instructions,this);
        });



        this.add(titleLabel);
        this.add(gameInstructionsButton);
        this.add(startGameButton);

        this.setVisible(true);


    }

}