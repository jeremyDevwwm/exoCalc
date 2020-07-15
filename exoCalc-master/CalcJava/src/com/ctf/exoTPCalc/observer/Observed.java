package com.ctf.exoTPCalc.observer;


/*
script de l'observable
 */

public interface Observed {
    public void addObserver(Observer obs);
    public void updateObserver();
    public void delObserver();
}
