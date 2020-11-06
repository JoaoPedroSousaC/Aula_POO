package br.edu.ifpb.Conta;

public class QuantiaNegativaException extends Exception {
    public QuantiaNegativaException() {
        super("Digite um valor positivo!");
    }
}
