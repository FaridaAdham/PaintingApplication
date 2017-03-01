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
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Stack;
import paint.Line;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed EL-Halawany
 */
public class Canvas extends JPanel{
    public ArrayList <Shape> shapes= new ArrayList<Shape>();
    public ArrayList <Shape> tools= new ArrayList<Shape>();
    public ArrayList<Triangle> tri = new ArrayList<Triangle>();
    public ArrayList<Pentagon> pent = new ArrayList<Pentagon>();
    public ArrayList <Shape> selected= new ArrayList<Shape>();
    public ArrayList <Resizeboxes> selection= new ArrayList<Resizeboxes>();
    public ArrayList<Line> lines = new ArrayList<Line>();
    public ArrayList<Line2D> lines2d = new ArrayList<Line2D>();
    public ArrayList<Shape> filled = new ArrayList<Shape>();
    public ArrayList<Text>text = new ArrayList <Text>();
    public ArrayList<Shape>selectedshapes = new ArrayList<Shape>();
    public Stack s1 = new Stack();
    public Stack s2 = new Stack();
    public int dcircle =0;
    public int drec=0;
    public int dsq = 0;
    public int doval = 0;
    public int select = 0;
    
    paintframe pf ;
    //paintframe pf=new paintframe();
    Graphics2D x;
    boolean h=false;
    public Color colorx;
    public Stroke strokex;
    
        
    public Canvas() {
    //this.colorx =pf.color;
        
    }
    public void stroke(Stroke stroke) {
        this.strokex =stroke;
    }
    
    public void color(Color color) {
        this.colorx =color;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        Graphics2D g2d = (Graphics2D)g;
        for (Shape shape: shapes) {
            shape.draw(g2d);
        }
        for (Triangle t: tri) {
            t.draw(g2d);
        }
        for (Pentagon p: pent) {
            p.draw(g2d);
        }
        for (Shape tool: tools) {
               tool.drawfill(g2d);
        }
        for (Shape fill: filled) {
               fill.drawfill(g2d);
        }
        for (Line line: lines) {
               line.draw(g2d);
        }
        for (Line2D line2d: lines2d) {
               g2d.setColor(Color.LIGHT_GRAY);
               g2d.setStroke(strokex);
               g2d.drawLine((int)line2d.getX1(), (int)line2d.getY1(), (int)line2d.getX2(),(int)line2d.getY2());
        }
         for (Shape item: selected) {
            item.draw(g2d);
       }
        
        for (Resizeboxes item: selection) {
            item.drawboxes(g2d);
       }
        for (Text text:text)
        {
            text.drawText(g);
        }
    }
}
