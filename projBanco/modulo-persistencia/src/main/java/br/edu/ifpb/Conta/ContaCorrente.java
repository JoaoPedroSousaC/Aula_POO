package br.edu.ifpb.Conta;

import java.io.PrintWriter;
import  br.edu.ifpb.Conta.*;

public class ContaCorrente {

    private int Numero;
    private String Titular;
    private double Saldo;

    double[] list;

    public ContaCorrente() {
        Numero = 0;
        Titular = "Vazio";
        Saldo = 0;
    }
    public ContaCorrente( int número, String titular, double saldoInicial ) throws EntradaInvalidaException, QuantiaNegativaException {
        setNumero( número );
        setTitular( titular );
        Depositar( saldoInicial );
    }
    public int getNumero() {
        return Numero;
    }

    public void setNumero( int umNúmero )throws EntradaInvalidaException{
        if ( umNúmero > 0 )
            Numero = umNúmero;
        else throw new EntradaInvalidaException();
    }


    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular)throws EntradaInvalidaException {
        if(titular.isEmpty()==false) {
            Titular = titular;
        }
        else throw new EntradaInvalidaException();
    }


    public void Sacar(double valor)throws QuantiaNegativaException,SaldoInsuficienteException{
        if (valor > 0) {
            if (valor <= Saldo) {
                Saldo -= valor;

                DescontaCPMF(CalculaCPMF(valor));
            }
            else throw new SaldoInsuficienteException();
        }
        else throw new QuantiaNegativaException();
    }

    public void Depositar(double valor)throws QuantiaNegativaException{
        if (valor>0){
            Saldo += valor;
        }
        else throw new QuantiaNegativaException();
    }

    public double CalculaCPMF(double valor){
        return valor*0.01;
    }

    public void DescontaCPMF(double valor){
        Saldo-= valor;
    }


    public double getSaldo() {
        return Saldo;
    }
    public void sair() {
        System.exit(0);
    }

    @Override
    public String toString()
    {
        return "Conta: " + this.getNumero() +
                "; Titular: " + this.getTitular() +
                "; R$ " +  this.getSaldo();
    }
}
