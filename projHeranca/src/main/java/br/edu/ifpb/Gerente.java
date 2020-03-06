package br.edu.ifpb;

public class Gerente extends Funcionario {
    private double Comissao;

    public Gerente() {
        super();
        this.setComissao(2);

    }

    public Gerente(int matrícula,
                   String nome,
                   double salário,
                   int comissao ) {
        super( matrícula, nome, salário );
        setComissao(comissao);
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double comissao) {
        Comissao = comissao;
    }

    @Override
    public double getSalário() {
        return super.getSalário() + Comissao;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Comissao: " + this.Comissao +
                " Salário Base (R$): " + super.getSalário();
    }
}
