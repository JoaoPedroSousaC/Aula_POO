package br.edu.ifpb.teste;

import br.edu.ifpb.Conta.ContaCorrente;
import org.junit.Assert;
import org.junit.Test;

public class testeConta {
    @Test
    public void testarDepositarFunciona(){
        ContaCorrente c = new ContaCorrente();
        c.Depositar(100);
        Assert.assertEquals(100.0,c.getSaldo(), 0);
    }

    @Test
    public void testarDepositarNFunciona(){
        ContaCorrente c = new ContaCorrente();
        c.Depositar(150);
        Assert.assertNotEquals(100.0,c.getSaldo(), 0);
    }

}
