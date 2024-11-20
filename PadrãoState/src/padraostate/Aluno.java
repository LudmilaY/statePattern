/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostate;

/**
 *
 * @author user
 */
public class Aluno {
    
    private String nome;
    private AlunoEstado estado;
    
    public Aluno(){
        this.estado = new AlunoEstadoMatriculado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public String matricular(){
        return estado.matricular(this);
    }
    
    public String formar(){
        return estado.formar(this);
    }
    
    public String trancar(){
        return estado.trancar(this);
    }
    
    public String jubilar(){
        return estado.jubilar(this);
    }
    
    public String abandonar(){
        return estado.abandonar(this);
    }
    
    public String transferir(){
        return estado.transferir(this);
    }
    
    public String getNomeEstado(){
        return estado.getEstado();
    }
    
    
    
}
