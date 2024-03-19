package com.miquelini.calculadora.entities;

public class Operacao {
    private String tipo;
    private double num1;
    private double num2;

    public Operacao() {
    }

    public Operacao(String tipo, double num1, double num2) {
        this.tipo = tipo;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
