package org.example;

import java.util.Observable;

public class Contrato extends Observable {

    private double salario;

    public Contrato(double salario){
        this.salario = salario;
    }

    public void pagarSalario(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Salario bruto = R$" + salario;
    }
}
