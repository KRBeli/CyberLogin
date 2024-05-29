package com.mycompany.Bordas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundJPanel extends JPanel{
    
    private Shape shape;

    public RoundJPanel() {
        setOpaque(false); // As we paint the background, make it transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getBackground());
        int x = 0, y = 0, w = getWidth() - 1, h = getHeight() - 1;
        int arc = 20; // This is the arc size
        g2d.fillRoundRect(x, y, w, h, arc, arc);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        int x = 0, y = 0, w = getWidth() - 1, h = getHeight() - 1;
        int arc = 20; // This is the arc size
        g.drawRoundRect(x, y, w, h, arc, arc);
    }
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        }
        return shape.contains(x, y);
    }
}
