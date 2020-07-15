package com.ctf.exoTPCalc;
import com.ctf.exoTPCalc.observer.Observed;
import com.ctf.exoTPCalc.observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//J'implémente l'observable

public class Bouton extends JPanel implements Observed {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    static String btnVal = "";
    private JButton btn = new JButton();
    ArrayList<Observer> listObservateur = new ArrayList<Observer>();

    /*

    Le constructeur va créer un nombre de boutons dans l'interface en fonction de la taille du tableau
    Ces boutons ne concernent que les chiffres
     */


    public Bouton(){

        // Je set une grille qui va placer les boutons

        this.setLayout(new GridLayout(4, 3));

        // Pour la longueur du tableau, je crée un bouton qui prendra comme valeur la cellule courante

        for(int i = 0; i<values.length; i++){
            JButton btnLarge = new JButton(values[i]);
        // Je crée une dimension
            btnLarge.setPreferredSize(new Dimension(50, 60));
        // J'ajoute un écouteur sur chaque bouton
            btnLarge.addActionListener(new BtnListener());
        // J'ajoute les outons dans la partie gauche de l'interface
            this.add(btnLarge, BorderLayout.WEST);
        }
        // Je crée un bouton = dans l'interface pour le séparer du reste
        JButton equal = new JButton("=");
        this.add(equal, BorderLayout.WEST);
        // Même chose pour le séparateur
        JButton dot = new JButton(".");
        this.add(dot, BorderLayout.WEST);

    }

    // J'ajoute un observateur
    @Override
    public void addObserver(Observer obs) {
        listObservateur.add(obs);
        System.out.println("obs");
    }

    // Je modifie la valeur de la propriété btnVal en fonction des modifications
    @Override
    public void updateObserver() {

        for(Observer obs : this.listObservateur)
            obs.update(this.btnVal);
        System.out.println(this.btnVal + "Hi !");
        System.out.println(this.listObservateur);

    }
    // Cette fonction gère la suppression d'un observateur
    @Override
    public void delObserver() {
        this.listObservateur = new ArrayList<Observer>();
    }

    //Je crée la classe interne BtnListener
    class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Bouton.btnVal += e.getActionCommand();
            updateObserver();

        }

    }



}
