package com.ctf.exoTPCalc;

import com.ctf.exoTPCalc.observer.Observer;

import javax.swing.*;
import java.awt.*;


public class Ecran extends JPanel {
    JLabel lab = new JLabel();
    public  Bouton btn = new Bouton();


    public Ecran(){

        //this.btn.addObserver(value ->  System.out.println(value +"hello"));
        this.btn.addObserver(new Observer() {
            @Override
            public void update(String value) {
                System.out.println(value+"hello");
            }
        });


        lab.setHorizontalAlignment(JLabel.CENTER);
        lab.setPreferredSize(new Dimension(250,20));
        this.add(lab, BorderLayout.NORTH);
    }


}
