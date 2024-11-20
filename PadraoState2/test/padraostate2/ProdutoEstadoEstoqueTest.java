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
public class ProdutoEstadoEstoqueTest extends TestCase {
    
    Produto produto;
    
    public ProdutoEstadoEstoqueTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        produto = new Produto();
    }

    public void testGetEstado_ProdutoEstadoCancelado(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto cancelado", produto.cancelar());
    }
    
    public void testGetEstado_ProdutoEstadoEntregue(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto não pode ser entregue ainda", produto.entregar());
    }
    
    public void testGetEstado_ProdutoEstadoEnviado(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto enviado", produto.enviar());
    }
    
    public void testGetEstado_ProdutoEstadoEstoque(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto está no estoque, portanto não pode ser estocado novamente", produto.estocar());
    }
    
    public void testGetEstado_ProdutoEstadoExtraviado(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto não pode extraviar", produto.extraviar());
    }
    
    public void testGetEstado_ProdutoEstadoTransito(){
        produto.setEstado(new ProdutoEstadoEstoque());
        assertEquals("Produto não pode estar em trânsito", produto.transitar());
    }
    
}
