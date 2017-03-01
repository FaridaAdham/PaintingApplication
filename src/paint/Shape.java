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
public abstract class Shape {
    private int x;
    private int y;
    
    private Color color;
    protected String shapename;
    private Stroke stroke;
    Graphics g ;
    Canvas ca = new Canvas();
    //protected boolean is_selected;
    
    public Shape (int x, int y, Color color, String shapename,Stroke stroke)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.stroke=stroke;
        this.shapename = shapename;
    }
    
    public abstract void drawfill(Graphics2D g2d);
    public abstract void draw(Graphics2D g2d);
    
    public boolean ContPt(Shape sh , int X,int Y)
    {
        boolean st=false;
        if(sh instanceof Circle)
        {
            
            
            if((X<(((Circle)sh).getX()+2*((Circle)sh).getRadius())&&X>(((Circle)sh).getX()))/*-((Circle)sh).getRadius())*/&&
                    (Y<(((Circle)sh).getY()+2*((Circle)sh).getRadius())&&Y>(((Circle)sh).getY())))/*-(((Circle)sh).getRadius())))*/
            {
                st=true;
                
            }
            
        }
        else if(sh instanceof Rectangle)
        {
            if(X>(((Rectangle)sh).getX())&& X<(((Rectangle)sh).getLength())+(((Rectangle)sh).getX())&&
                    Y>(((Rectangle)sh).getY())&& Y<(((Rectangle)sh).getWidth())+(((Rectangle)sh).getY()))
            {
                st=true;
                
            }
        }
        else if(sh instanceof Square)
        {
            if(X>(((Square)sh).getX())&& X<(((Square)sh).getSide())+(((Square)sh).getX())&&
                    Y>(((Square)sh).getY())&& Y<(((Square)sh).getSide())+(((Square)sh).getY()))
            {
                st=true;
                return st;
            }
        }
        else if(sh instanceof Oval)
        {
            if((X<(((Oval)sh).getX()+2*((Oval)sh).getH_radius())&&X>((((Oval)sh).getX())))/*-((Oval)sh).getH_radius()))*/&&
                    (Y<(((Oval)sh).getY()+2*((Oval)sh).getV_radius())&&Y>(((Oval)sh).getY())))/*-(((Oval)sh).getV_radius())))*/
            {
                st=true;
               
                
            
            }
        }
        return st;
    }
    
    public void drawfillrect(Shape sh)
    {
        Graphics2D g2d = (Graphics2D)g;
        if(sh instanceof Rectangle)
        {
            //ca.x.drawString("HIIIIIII", 100, 100);
            ca.x.fillRect((sh.getX())-5,(sh.getY())-5 , 30, 30);
            // g.drawRect(((sh.x)+(sh.)-1, (sh.y)-1 , 2, 2);
            
        }
        else if(sh instanceof Square)
        {
            
        }
        else if(sh instanceof Circle)
        {
        
        }
        
        
    }
   // public boolean getselected(Shape shape)
   // {
        
    //}

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the stroke
     */
    public Stroke getStroke() {
        return stroke;
    }
}
