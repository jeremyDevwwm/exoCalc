package com.ctf.exoTPCalc;

import com.ctf.exoTPCalc.observer.Observer;

import javax.swing.*;
import java.awt.*;


public class Ecran extends JPanel {
    JLabel lab;
    public  Bouton btn;


    public Ecran(){
        lab = new JLabel();
        btn = new Bouton();
        // J'ajoute l'observateur
        Observer obs = new Observer() {

            // J'utilise la fonction update pour renvoyer, dans ce cas présent, un retour console de la valeur + Hello afin
            // de le différencier des autres retours console

            @Override
            public void update(String value) {
                lab.setText(value);
                System.out.println(value+"hello");
            }
        };

        System.out.println("hash ecran : " + this.btn.hashCode());
        this.btn.addObserver(obs);

        System.out.println("hash ecran : " + this.btn.hashCode());
        // Je centre cet "écran" vers le haut avec des dimensions et je l'ajoute à l'interface graphique
        lab.setHorizontalAlignment(JLabel.CENTER);
        lab.setPreferredSize(new Dimension(250,20));
        this.add(lab, BorderLayout.NORTH);
    }


}
