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
public class Produto {
    
    private String nome;
    private ProdutoEstado estado;
    
    public Produto(){
        this.estado = new ProdutoEstadoEstoque();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoEstado getEstado() {
        return estado;
    }

    public void setEstado(ProdutoEstado estado) {
        this.estado = estado;
    }
    
    public String cancelar(){
        return estado.cancelar(this);
    }
    
    public String entregar(){
        return estado.entregar(this);
    }
    
    public String enviar(){
        return estado.enviar(this);
    }
    
    public String estocar(){
        return estado.estocar(this);
    }
    
    public String extraviar(){
        return estado.extraviar(this);
    }
    
    public String transitar(){
        return estado.transitar(this);
    }
    
    public String getNomeEstado(){
        return estado.getEstado();
    }
    
    
    
}
