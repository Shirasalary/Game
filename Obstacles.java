import java.awt.*;
import java.util.Random;

public abstract class Obstacles {

    private int x;
    private int y;
    private int width;
    private int height;

    private static int START_X = Constants.WINDOW_WIDTH/5;

    public Obstacles(){
        Random random = new Random();
        this.x = START_X;
        this.height = random.nextInt(Constants.MIN_OBSTACLE_HEIGHT, Constants.WINDOW_HEIGHT/2 - Constants.BIRD_HEIGHT/2-Constants.WIDTH_DISTANCE_OBSTACLE /2);
        this.width = Constants.OBSTACLE_WIDTH;
        START_X+= Constants.UP_DISTANCE_OBSTACLE + Constants.OBSTACLE_WIDTH;
    }

    protected void setY(int newY){
        this.y = newY;
    }
    public void paint(Graphics graphics){
         graphics.fillRect(this.x,this.y,this.width,this.height);
         graphics.setColor(Color.BLACK);
    }

}
