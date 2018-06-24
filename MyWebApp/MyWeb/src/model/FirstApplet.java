package model;

import java.awt.Graphics;

import java.util.Calendar;

import javax.swing.JApplet;

public class FirstApplet extends JApplet{
    private Calendar calendar;
    
    
    public void init(){
        calendar = Calendar.getInstance();
        setSize(250, 80);
    }
    public void paint(Graphics g){
        g.drawString("Апплет запущен", 20, 15);
        g.drawString(calendar.getTime().toString(), 20, 35);
    }
}
