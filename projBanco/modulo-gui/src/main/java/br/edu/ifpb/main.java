package br.edu.ifpb;

import br.edu.ifpb.Conta.QuantiaNegativaException;
import br.edu.ifpb.Conta.SaldoInsuficienteException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class main {
    public static void main(String[] args) throws FileNotFoundException, SaldoInsuficienteException, QuantiaNegativaException {
        InterfaceTextual x = new InterfaceTextual();
        PrintWriter pw = new PrintWriter("C:\\Users\\gamer\\Documents\\GitHub\\Aula_POO\\projBanco/extrato.txt");
        pw.printf("--------------EXTRATO------------");

        try{x.exibirMenu(pw);}
        catch (Exception e){
            System.out.println(e.getMessage());

        }






    }
}
