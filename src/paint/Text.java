/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author ahmed
 */
public class Text {
    protected String Text;
    protected int font;
    protected int Size;
    protected double x ;
    protected double y ;
    
    public Text (String Text , String font, int Size,double x , double y  )
    {
        this.Text = Text;
        if (font.equalsIgnoreCase("Bold"))
        this.font = 1;
        else if (font.equalsIgnoreCase("Italic"))
            this. font = 2;
        else if (font.equalsIgnoreCase("Plain"))
            this.font = 0 ;
        this.Size = Size;
        this.x=x;
        this.y=y;
    }
    public void setx(double x)
    {
        this.x = x;
    }
    public void sety(double y)
    {
        this.y = y;
    }
    public void drawText(Graphics g)
    {
        Font f = new Font ("Dialog",font,Size);
            g.setFont(f);
        g.drawString(Text,(int) x,(int) y);
        
    }
   
}
