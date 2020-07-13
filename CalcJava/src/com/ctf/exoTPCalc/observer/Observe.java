package com.ctf.exoTPCalc.observer;

public interface Observe {
    public void addObserver(Observer obs);
    public void updateObserver();
    public void delObserver();
}
