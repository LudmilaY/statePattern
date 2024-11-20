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
public class ProdutoEstadoExtraviado implements ProdutoEstado{
    
    public String getEstado(){
        return "Extraviado";
    }
    
    public String estocar(Produto produto){
        produto.setEstado(new ProdutoEstadoEstoque());
        return "Produto vai ter ser retirado novamente do estoque";
    }
    
    public String cancelar(Produto produto){
        return "Produto não pode ser cancelado";
    }
    
    public String entregar(Produto produto){
        return "Produto não pode ser entregue";
    }
    
    public String enviar(Produto produto){
        return "Produto não foi enviado";
    }
    
    public String extraviar(Produto produto){
        return "Produto extraviado";
    }
    
    public String transitar(Produto produto){
        return "Produto não está em trânsito";
    }
}
