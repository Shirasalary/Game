import javax.swing.*;
import java.awt.*;

public class Utils {

    public static void setJFrameWindow(JFrame window, String title)
    {
        window.setTitle(title);
        window.setLayout(null);
        window.setResizable(false);
        window.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void setJPanelWindow(JPanel window)
    {
        window.setLayout(null);
        window.setBounds(0,0,Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        window.setVisible(true);
    }

    public static void switchPanels(JPanel toSee, JPanel toRemove)
    {
        toRemove.setVisible(false);
        toSee.setVisible(true);
    }

    public static JLabel newLabel (String text, int x, int y)
    {
        JLabel label = new JLabel(text);
        label.setBounds(x,y,Constants.LABEL_WIDTH,Constants.LABEL_HEIGHT);
        label.setFont(Constants.myFont);
        return label;
    }

    public static JButton newButton (String text, int x, int y)
    {
        JButton button = new JButton(text);
        button.setBounds(x,y,Constants.BUTTON_WIDTH,Constants.BUTTON_HEIGHT);
        button.setFocusable(false);
        button.setFont(Constants.myFont);
        return button;
    }

    public  static void showMessage(Component window, String message) {
        JOptionPane.showMessageDialog(window, message, message, JOptionPane.INFORMATION_MESSAGE);
    }


}
