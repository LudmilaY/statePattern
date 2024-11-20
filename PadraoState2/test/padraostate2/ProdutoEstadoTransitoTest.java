/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostate2;

import static junit.framework.Assert.assertEquals;
import padraostate2.Produto;
import junit.framework.TestCase;

/**
 *
 * @author user
 */
public class ProdutoEstadoTransitoTest extends TestCase {
    
    Produto produto;
    
    public ProdutoEstadoTransitoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        produto = new Produto();
    }

    public void testGetEstado_ProdutoEstadoCancelado(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto não pode ser cancelado", produto.cancelar());
    }
    
    public void testGetEstado_ProdutoEstadoEntregue(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto pode ser entregue", produto.entregar());
    }
    
    public void testGetEstado_ProdutoEstadoEnviado(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto não foi enviado", produto.enviar());
    }
    
    public void testGetEstado_ProdutoEstadoEstoque(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto já saiu e está em trânsito", produto.estocar());
    }
    
    public void testGetEstado_ProdutoEstadoExtraviado(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto foi extraviado", produto.extraviar());
    }
    
    public void testGetEstado_ProdutoEstadoTransito(){
        produto.setEstado(new ProdutoEstadoTransito());
        assertEquals("Produto está em trânsito", produto.transitar());
    }
    
}
