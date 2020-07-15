package com.ctf.exoTPCalc;

import javax.swing.*;
import java.awt.*;

// Cette classe traitera des opérateurs
public class Operators extends JPanel{
    String[] operators ={"+", "-", "x", "/"};

    // Ici, même processus que les chiffrees, à l'exception que je n'ai pas encore mit d'observer et d'observaable
    public Operators(){
        this.setLayout(new GridLayout(4, 1));
            for(int i = 0; i<operators.length; i++){
                JButton opr = new JButton(operators[i]);
                opr.setPreferredSize(new Dimension(60,60));
                this.add(opr, BorderLayout.EAST);
            }
    }

}
