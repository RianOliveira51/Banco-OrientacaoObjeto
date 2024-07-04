package Entities;

import java.util.Date;

public class Conta {
    private String name;
    private double saldo;
    private int conta;

    private Date date;

    //criando constante
    static final int taxa = 5;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Conta não pode ser alterada, por isso não tem o set Conta
    public int getConta(){
        return conta;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public Date getData(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public double depositar(double deposite){
        return this.saldo += deposite;
    }

    public void sacar(double sacar){
        this.saldo = this.saldo - sacar - this.taxa;
    }

    public String toString() {
        return "Account data:" + date + "\nAccount: " + conta  + ", Holder: " + name + ", Balance: " + saldo;
    }
}
