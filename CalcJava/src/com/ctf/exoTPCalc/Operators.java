package com.ctf.exoTPCalc;

import javax.swing.*;
import java.awt.*;

public class Operators extends JPanel{
    String[] operators ={"+", "-", "x", "/"};

    public Operators(){
        this.setLayout(new GridLayout(4, 1));
            for(int i = 0; i<operators.length; i++){
                JButton opr = new JButton(operators[i]);
                opr.setPreferredSize(new Dimension(60,60));
                this.add(opr, BorderLayout.EAST);
            }
    }

}
