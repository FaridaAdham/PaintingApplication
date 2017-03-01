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
public class Rectangle extends Shape{
    private int length;
    private int width;
    
    public Rectangle (int x, int y, Color color, int length, int width,Stroke stroke)
    {
        super(x, y, color, "Rectangle",stroke);
        this.length=length;
        this.width = width;
        
    }

    

    @Override
    public void draw(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.drawRect(getX(), getY(), getLength(), getWidth());
        g2d.setColor(tmp);
    }

    @Override
    public void drawfill(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.fillRect(getX(), getY(), getLength(), getWidth());
        g2d.setColor(tmp);
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
