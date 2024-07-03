/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistema_compras;

import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author damen
 */
public class TestPersistencia {
    
    @Test
    public void testeConexao(){
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("Conexão com o banco realizada!");
        } else {
            System.out.println("Falha ao conectar no banco!");
        }
        
    }
    
}
