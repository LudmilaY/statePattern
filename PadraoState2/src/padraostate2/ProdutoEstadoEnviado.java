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
public class ProdutoEstadoEnviado implements ProdutoEstado{
    
    public String getEstado(){
        return "Enviado";
    }
    
    public String estocar(Produto produto){
        return "Produto já saiu do estoque";
    }
    
    public String cancelar(Produto produto){
        return "Produto não pode ser cancelado";
    }
    
    public String entregar(Produto produto){
        return "Produto não entregue";
    }
    
    public String enviar(Produto produto){
        return "Produto foi enviado";
    }
    
    public String extraviar(Produto produto){
        return "Produto não pode extraviar";
    }
    
    public String transitar(Produto produto){
        produto.setEstado(new ProdutoEstadoTransito());
        return "Produto em trânsito";
    }
}
