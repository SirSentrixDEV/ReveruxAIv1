package net.reverux.reveruxai.core.neuronalesnetz;

import java.util.ArrayList;

public class Netz {

    ArrayList<Neuron> input = new ArrayList<Neuron>();
    ArrayList<Neuron> hidden = new ArrayList<Neuron>();
    ArrayList<Neuron> output = new ArrayList<Neuron>();


    public Netz(int input, int hidden, int output) {
        for(int i = 0; i < input; i++) {
            this.input.add(new Neuron(this.hidden));
        }
        for(int i = 0; i < hidden; i++) {
            this.hidden.add(new Neuron(this.output));
        }
        for(int i = 0; i < output; i++) {
            this.output.add(new Neuron(null));
        }
    }

}
