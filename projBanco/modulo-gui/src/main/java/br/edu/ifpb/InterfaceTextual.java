package br.edu.ifpb;


import br.edu.ifpb.Conta.ContaCorrente;

import java.util.Scanner;

public class InterfaceTextual {
    ContaCorrente c1 = new ContaCorrente();
    public void exibirMenu(){

        System.out.println("---Projeto Conta Corrente---");
        System.out.println("  1. Saque");
        System.out.println("  2. Deposito");
        System.out.println("  3. Saldo na tela");
        System.out.println("  4. Extrato na tela");
        System.out.println("  5. Sair");
        System.out.println("----------------------------");
        System.out.println("  Digite uma opção:");
        Scanner opcao = new Scanner(System.in);
        int op=opcao.nextInt();
        if(op == 1){
            System.out.println("  Digite um Valor:");
            Scanner valor = new Scanner(System.in);
            int v=opcao.nextInt();
            c1.Sacar(v);
            exibirMenu();
        }
        if(op == 2){
            System.out.println("  Digite um Valor:");
            Scanner valor = new Scanner(System.in);
            int v=opcao.nextInt();
            c1.Depositar(v);
            exibirMenu();
        }
        if(op == 3){
            System.out.println("R$: "+ c1.getSaldo());
            exibirMenu();
        }

        if(op == 5){
            c1.sair();
        }

    }


}
