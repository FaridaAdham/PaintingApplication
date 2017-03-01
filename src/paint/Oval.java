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
public class Oval extends Shape{
    private int h_radius;
    private int v_radius;

    public Oval (int x, int y, Color color, int h_radius, int v_radius,Stroke stroke)
    {
        super(x, y, color, "Oval",stroke);
        this.h_radius = h_radius;
        this.v_radius = v_radius;
    }
    
    @Override
    public void drawfill(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.fillOval(getX(), getY(), getH_radius()*2, getV_radius()*2);
        g2d.setColor(tmp);
    }

    @Override
    public void draw(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(getColor());
        g2d.setStroke(getStroke());
        g2d.drawOval(getX(), getY(), getH_radius()*2, getV_radius()*2);
        g2d.setColor(tmp);
    }

    /**
     * @return the h_radius
     */
    public int getH_radius() {
        return h_radius;
    }

    /**
     * @param h_radius the h_radius to set
     */
    public void setH_radius(int h_radius) {
        this.h_radius = h_radius;
    }

    /**
     * @return the v_radius
     */
    public int getV_radius() {
        return v_radius;
    }

    /**
     * @param v_radius the v_radius to set
     */
    public void setV_radius(int v_radius) {
        this.v_radius = v_radius;
    }
}
