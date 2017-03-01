/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Ahmed EL-Halawany
 */
public class Square extends Rectangle {
    private int side;
    
    public Square (int x, int y, Color color, int side,Stroke stroke)
    {
        super(x,y,color,side,side,stroke);
        this.side = side;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.drawRect(getX(), getY(), getSide(), getSide());
        g2d.setColor(tmp);
    }

    @Override
    public void drawfill(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.fillRect(getX(), getY(), getSide(), getSide());
        g2d.setColor(tmp);
    }

    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
    }
}
