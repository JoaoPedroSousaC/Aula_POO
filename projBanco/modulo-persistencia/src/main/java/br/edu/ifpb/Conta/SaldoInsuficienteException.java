package br.edu.ifpb.Conta;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("O saldo da conta é insuficiente!");
    }
}
