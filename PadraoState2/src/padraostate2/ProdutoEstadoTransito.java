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
public class ProdutoEstadoTransito implements ProdutoEstado{
    
    public String getEstado(){
        return "Em trânsito";
    }
    
    public String estocar(Produto produto){
        return "Produto já saiu e está em trânsito";
    }
    
    public String cancelar(Produto produto){
        return "Produto não pode ser cancelado";
    }
    
    public String entregar(Produto produto){
        produto.setEstado(new ProdutoEstadoEntregue());
        return "Produto pode ser entregue";
    }
    
    public String enviar(Produto produto){
        return "Produto não foi enviado";
    }
    
    public String extraviar(Produto produto){
        produto.setEstado(new ProdutoEstadoExtraviado());
        return "Produto foi extraviado";
    }
    
    public String transitar(Produto produto){
        return "Produto está em trânsito";
    }
}
