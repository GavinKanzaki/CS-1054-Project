import javafx.application.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.util.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.scene.image.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.net.*;
import javafx.geometry.*;

class Mine extends DrawableObject 
{
    private Color color;
    private static final Color RED = Color.RED;
    private static final Color WHITE = Color.WHITE;

    public Mine(float x, float y) 
    {
        super(x, y);
        color = interpolateColor(RED, WHITE, Math.random());
    }

    private Color interpolateColor(Color a, Color b, double proportion) 
    {
        double inverseProportion = 1.0 - proportion;
        double red = a.getRed() * proportion + b.getRed() * inverseProportion;
        double green = a.getGreen() * proportion + b.getGreen() * inverseProportion;
        double blue = a.getBlue() * proportion + b.getBlue() * inverseProportion;
        return new Color(red, green, blue, 1.0);
    }

    public void draw(GraphicsContext gc) 
    {
        gc.setFill(color);
        gc.fillOval(getX(), getY(), 20, 20);
    }
}