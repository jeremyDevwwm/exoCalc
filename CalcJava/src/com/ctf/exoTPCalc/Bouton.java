package com.ctf.exoTPCalc;
import com.ctf.exoTPCalc.observer.Observed;
import com.ctf.exoTPCalc.observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Bouton extends JPanel implements Observed {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    static String btnVal = "";
    private JButton btn = new JButton();
    ArrayList<Observer> listObservateur = new ArrayList<Observer>();
    public Bouton(){
        this.setLayout(new GridLayout(4, 3));
        for(int i = 0; i<values.length; i++){
            JButton btnLarge = new JButton(values[i]);
            btnLarge.setPreferredSize(new Dimension(50, 60));
            btnLarge.addActionListener(new BtnListener());
            this.add(btnLarge, BorderLayout.WEST);
        }
        JButton equal = new JButton("=");
        this.add(equal, BorderLayout.WEST);

        JButton dot = new JButton(".");
        this.add(dot, BorderLayout.WEST);

    }

    @Override
    public void addObserver(Observer obs) {
        listObservateur.add(obs);
        System.out.println("obs");
    }

    @Override
    public void updateObserver() {

        for(Observer obs : this.listObservateur)
            obs.update(this.btnVal);
        System.out.println(this.btnVal + "Hi !");
        System.out.println(this.listObservateur);

    }

    @Override
    public void delObserver() {
        this.listObservateur = new ArrayList<Observer>();
    }

    class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Bouton.btnVal += e.getActionCommand();
            updateObserver();

        }

    }



}
