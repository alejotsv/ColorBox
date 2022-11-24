package com.java21days;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    Color color;
    CustomPanel(Color color){
        super();
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics comp){
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(this.color);
        System.out.println(comp2D.getColor());
        comp2D.drawString("Painting string", 10, 10);
    }
}
