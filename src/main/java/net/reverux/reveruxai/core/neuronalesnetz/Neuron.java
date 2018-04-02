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
        double sum = 0;
        double length = Math.min(input.length, gewicht.length);

        for(int i = 0; i < length; i++) {

        }

        return 0;
    }

}
