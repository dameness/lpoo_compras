/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistema_compras;

import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.model.Produto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author damen
 */
public class TestPersistenciaProduto {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestPersistenciaProduto() {
    }
    
    @Before //antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After //depois da persistencia
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testarPersistenciaProduto() throws Exception{
        Produto p = new Produto();
        p.setDescricao("teste");
        p.setValor(5000.0);
        jpa.persist(p);
        
        Produto persistidoProduto = (Produto)jpa.find(Produto.class, p.getId());
        
        Assert.assertEquals(p, persistidoProduto);
    }
}
