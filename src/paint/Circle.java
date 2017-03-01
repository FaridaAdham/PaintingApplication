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
public class Circle extends Oval{
    
    private int radius;
    
    
    public Circle(int x, int y, Color color, int radius,Stroke stroke)
    {
        super(x, y, color, radius,  radius,stroke);
        this.radius = radius;
    }

    
    
    @Override
    public void draw(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.drawOval(getX(), getY(), getRadius()*2, getRadius()*2);
        g2d.setColor(tmp);
    }

    @Override
    public void drawfill(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
        g2d.setColor(tmp);
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
