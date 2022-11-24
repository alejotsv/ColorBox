package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ColorBox extends JFrame {
    Dimension dim = new Dimension(300, 300);

    ColorBox(String title, Color color){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
}
