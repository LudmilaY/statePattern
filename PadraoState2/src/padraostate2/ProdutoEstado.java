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
public interface ProdutoEstado {
    
    public String getEstado();
    
    public String cancelar(Produto produto);
    
    public String entregar(Produto produto);
    
    public String enviar(Produto produto);
    
    public String estocar(Produto produto);
    
    public String extraviar(Produto produto);
    
    public String transitar(Produto produto);
    
}
