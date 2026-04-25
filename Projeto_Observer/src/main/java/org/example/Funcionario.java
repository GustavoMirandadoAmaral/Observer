package org.example;

import java.util.Observable;
import java.util.Observer;

public class Funcionario implements Observer {

    private String nome;
    private String notificacaoSalario;

    public Funcionario(String nome){this.nome = nome;}

    public String getNotificacaoSalario(){return this.notificacaoSalario;}

    public void receber(Contrato contrato){contrato.addObserver(this);}

    public void update(Observable contrato, Object arg1){
        this.notificacaoSalario = this.nome + " seu salário foi pago!! \n" + contrato.toString();
    }
}
