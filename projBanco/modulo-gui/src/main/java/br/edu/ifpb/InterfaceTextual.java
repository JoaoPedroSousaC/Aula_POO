package br.edu.ifpb;


import br.edu.ifpb.Conta.ContaCorrente;
import br.edu.ifpb.Conta.EntradaInvalidaException;
import br.edu.ifpb.Conta.QuantiaNegativaException;
import br.edu.ifpb.Conta.SaldoInsuficienteException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class InterfaceTextual {
    ContaCorrente c1 = new ContaCorrente();

    public void exibirMenu(PrintWriter pw) throws FileNotFoundException, SaldoInsuficienteException, QuantiaNegativaException {


        pw.flush();
        System.out.println("---Projeto Conta Corrente---");
        System.out.println("  1. Criar uma Conta");
        System.out.println("  2. Saque");
        System.out.println("  3. Deposito");
        System.out.println("  4. Saldo na tela");
        System.out.println("  5. Extrato na tela");
        System.out.println("  Qualquer outro para Sair");
        System.out.println("----------------------------");
        System.out.print("  Digite uma opção:");
        try (Scanner opcao = new Scanner(System.in);) {


            int op = opcao.nextInt();
            if (op == 1) {
                System.out.print("Digite seu Numero:");
                try(Scanner s = new Scanner(System.in);)  {
                    int v = s.nextInt();
                    c1.setNumero(v);
                    System.out.print("Digite seu Nome:");
                    String n =s.next()  ;

                    c1.setTitular(n);
                    c1.Depositar(10);
                    exibirMenu(pw);
                } catch (Exception e ) {
                    System.out.print("Digite uma entrada válida!");

                }





            }
            if (op == 2) {
                System.out.print("  Digite um Valor:");
                try (Scanner valor = new Scanner(System.in);){
                    double v = opcao.nextInt();
                    c1.Sacar(v);
                    pw.printf("Numero:%3d - Titular:%-10s - Saque(R$):%.2f%n", c1.getNumero(), c1.getTitular(), v);
                    pw.printf("CPMF(R$):%.2f%n", c1.CalculaCPMF(v));
                    pw.printf("Saldo(R$):%.2f%n", c1.getSaldo());
                    exibirMenu(pw);
                }
                catch (SaldoInsuficienteException e){
                    System.out.print(e.getMessage());
                }



            }
            if (op == 3) {
                System.out.print("  Digite um Valor:");
                try(Scanner valor = new Scanner(System.in);) {
                    double v = opcao.nextInt();
                    c1.Depositar(v);
                    pw.printf("Numero:%3d - Titular:%-10s - Deposito(R$):%.2f%n", c1.getNumero(), c1.getTitular(), v);
                    pw.printf("Saldo(R$):%.2f%n", c1.getSaldo());

                    exibirMenu(pw);
                }


            }
            if (op == 4) {
                System.out.println("R$: " + c1.getSaldo());
                exibirMenu(pw);
            }


            if (op == 5) {


                try (Scanner s = new Scanner(Path.of("C:\\Users\\gamer\\Documents\\GitHub\\Aula_POO\\projBanco/extrato.txt"), StandardCharsets.UTF_8);) {

                    while (s.hasNextLine()) {
//
                        System.out.println(s.nextLine());

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                exibirMenu(pw);
            }
            c1.sair();
        }



    }


}
