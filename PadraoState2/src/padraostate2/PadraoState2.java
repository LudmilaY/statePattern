/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostate2;

/**
 *
 * @author user
 */
public class PadraoState2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Grupinho");
        produto.setEstado(new ProdutoEstadoEstoque());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.estocar());
        produto.setEstado(new ProdutoEstadoCancelado());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.cancelar());
        produto.setEstado(new ProdutoEstadoEntregue());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.entregar());
        produto.setEstado(new ProdutoEstadoEnviado());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.enviar());
        produto.setEstado(new ProdutoEstadoExtraviado());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.extraviar());
        produto.setEstado(new ProdutoEstadoTransito());
        System.out.println ("Produto " + produto.getNome() + " está no estado" 
                + produto.getNomeEstado() + "-" + produto.transitar());
        
    }
    
}
