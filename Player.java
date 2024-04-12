import javafx.scene.input.KeyCode;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player extends DrawableObject 
{

    public Player(float x, float y) 
    {
        super(x, y);
    }

    @Override
    public void drawMe(float x, float y, GraphicsContext gc) 
    {
        gc.setFill(Color.BLUE);
        gc.fillOval(x - 17.5, y - 17.5, 35, 35);
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x - 17.5, y - 17.5, 35, 35);
        gc.setFill(Color.WHITE);
        gc.fillText("Score: " + score, 10, 20);
    }

    }