package com.ctf.exoTPCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JPanel pan = new JPanel();


    public Fenetre(){
        this.setTitle("Calculatrice");
        pan.add(new Ecran());
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.add(new Bouton());
        pan.add(new Operators());
        setContentPane(pan);
        this.setVisible(true);

    }


}
