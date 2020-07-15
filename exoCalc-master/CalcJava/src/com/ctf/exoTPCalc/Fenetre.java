package com.ctf.exoTPCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Cette classe rassemble tout

public class Fenetre extends JFrame {
    private JPanel pan = new JPanel();

// Dans ce constructeur je donne un titre à l'application, j'ajoute Ecran, je donne une taille à la fenêtre
// J'ajoute les boutons (Operators et Boutons donc)
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
