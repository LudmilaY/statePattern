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
public class ProdutoEstadoEntregue implements ProdutoEstado{
    
    public String getEstado(){
        return "Entregue";
    }
    
    public String estocar(Produto produto){
        return "Produto foi entregue para o cliente";
    }
    
    public String cancelar(Produto produto){
        return "Produto não pode ser cancelado";
    }
    
    public String entregar(Produto produto){
        return "Produto entregue";
    }
    
    public String enviar(Produto produto){
        return "Produto já foi enviado";
    }
    
    public String extraviar(Produto produto){
        return "Produto não pode extraviar";
    }
    
    public String transitar(Produto produto){
        return "Produto não pode estar em trânsito";
    }
}
