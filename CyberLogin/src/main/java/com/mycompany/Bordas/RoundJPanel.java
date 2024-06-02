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
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getBackground());
        int x = 0, y = 0, w = getWidth() - 1, h = getHeight() - 1;
        int arc = 20; // This is the arc size
        g2d.fillRoundRect(x, y, w, h, arc, arc);
    }
}
