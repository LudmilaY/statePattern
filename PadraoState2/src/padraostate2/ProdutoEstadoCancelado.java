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
public class ProdutoEstadoCancelado implements ProdutoEstado{
    
    public String getEstado(){
        return "Cancelado";
    }
    
    public String estocar(Produto produto){
        return "Produto está cancelado, portanto está no estoque";
    }
    
    public String cancelar(Produto produto){
        produto.setEstado(new ProdutoEstadoCancelado());
        return "Produto cancelado";
    }
    
    public String entregar(Produto produto){
        return "Produto não pode ser entregue ainda";
    }
    
    public String enviar(Produto produto){
        return "Produto não pode ser enviado";
    }
    
    public String extraviar(Produto produto){
        return "Produto não pode extraviar";
    }
    
    public String transitar(Produto produto){
        return "Produto não pode estar em trânsito";
    }
}
