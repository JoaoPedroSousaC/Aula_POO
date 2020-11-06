package br.edu.ifpb.Conta;

public class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException() {
        super("Digite uma entrada válida!");
    }
}
