package br.edu.ifpb.Conta;

public class ContaCorrente {
    private int Numero;
    private String Titular;
    private double Saldo;

    double[] list;

    public ContaCorrente() {
        Numero = 666;
        Titular = "Juvito Gay";
        Saldo = 0;
    }

    public int getNumero() {
        return Numero;
    }




    public void setNumero(int numero) {
        if (numero>0) {
            Numero = numero;
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        if(titular.isEmpty()==false) {
            Titular = titular;
        }
    }


    public void Sacar(double valor){
        if (valor>0 && valor<=Saldo){
            Saldo-=valor;

            DescontaCPMF(CalculaCPMF(valor));
        }
    }

    public void Depositar(double valor){
        if (valor>0){
            Saldo += valor;
        }
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

    public void sair(){
        System.exit(0);
    }
}
