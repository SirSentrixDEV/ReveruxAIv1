package net.reverux.reveruxai.core.neuronalesnetz;

import java.util.ArrayList;

public class Neuron {

    double[] gewicht;
    double schwellwert;
    ArrayList<Neuron> sendToArrayList;

    public Neuron(ArrayList<Neuron> sendTo) {
        this.sendToArrayList = sendTo;
    }


    public int fire(double[] input) {

    }

}
