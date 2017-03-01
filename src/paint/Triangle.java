/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Ahmed EL-Halawany
 */
public class Triangle{
    protected int [] x;
    protected int [] y;
    protected Color color;
    protected String shapename;
    protected int size;
    protected Stroke stroke;
    Graphics g ;
    Canvas ca = new Canvas();
    public Triangle (int []x, int[] y, Color color,Stroke stroke)
    {
        this.x=x;
        this.y=y;
        this.color = color;
        this.shapename = "Triangle";
        this.size=4;
        this.stroke=stroke;        
    }


    public void draw(Graphics2D g2d) {
        Color tmp = g2d.getColor();
        g2d.setColor(color);
        g2d.setStroke(stroke);
        g2d.drawPolygon(x,y,size);
        g2d.setColor(tmp);
    }
}
