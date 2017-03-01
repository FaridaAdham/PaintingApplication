/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;

/**
 *
 * @author Ahmed EL-Halawany
 */
public class Line extends Shape {
    private int x1,y1;
    private Stroke stroke;
    public Line(int x, int y, Color color,int x1,int y1,Stroke stroke) {
        super(x, y, color,"Line",stroke);
        this.x1=x1;
        this.y1=y1;
        this.stroke=stroke;
    }

    @Override
    public void drawfill(Graphics2D g2d) {
    }

    @Override
    public void draw(Graphics2D g2d) {
               g2d.setColor(getColor());
               g2d.setStroke(getStroke());
               g2d.drawLine(getX(), getY(), getX1(), getY1());
    }
    public Line2D set(Line2D line,int x1,int y1,int x2,int y2)
    {
        line.setLine(x1, y1, x2, y2);
        return line;
    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @return the stroke
     */
    public Stroke getStroke() {
        return stroke;
    }
    
}
