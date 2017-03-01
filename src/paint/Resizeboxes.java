/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Farida Adham
 */
public class Resizeboxes {
    public int x;
    public int y ;
    public Color color;
    public int width;
    public int length;
     
     public Resizeboxes(int x, int y, Color c, int w, int l)
     {
         this.x = x;
         this.y = y;
         this.color = c;
         this.width = w;
         this.length = l;
         
     }
    
     public void drawboxes(Graphics2D g2d)
     {
         g2d.setColor(color);
         g2d.fillRect(x, y, length, width);
     }
     
     public boolean contains(Resizeboxes rb , int X, int Y )
     {
         if(X>(rb.x)&& X<(rb.length)+(rb.x)&&
                    Y>(rb.y)&& Y<(rb.width)+(rb.y))
            {
                return true;
                
            }
         return false;
     }
     
}
