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
public class ProdutoEstadoEntregueTest extends TestCase {
    
    Produto produto;
    
    public ProdutoEstadoEntregueTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        produto = new Produto();
    }

    public void testGetEstado_ProdutoEstadoCancelado(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto não pode ser cancelado", produto.cancelar());
    }
    
    public void testGetEstado_ProdutoEstadoEntregue(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto entregue", produto.entregar());
    }
    
    public void testGetEstado_ProdutoEstadoEnviado(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto já foi enviado", produto.enviar());
    }
    
    public void testGetEstado_ProdutoEstadoEstoque(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto foi entregue para o cliente", produto.estocar());
    }
    
    public void testGetEstado_ProdutoEstadoExtraviado(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto não pode extraviar", produto.extraviar());
    }
    
    public void testGetEstado_ProdutoEstadoTransito(){
        produto.setEstado(new ProdutoEstadoEntregue());
        assertEquals("Produto não pode estar em trânsito", produto.transitar());
    }
    
}
