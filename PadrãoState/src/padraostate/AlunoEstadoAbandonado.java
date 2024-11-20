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
public class AlunoEstadoAbandonado implements AlunoEstado{
    
    public String getEstado(){
        return "Abandonado";
    }
    
    public String matricular(Aluno aluno){
        return "Não pode ser matriculado pois abandonou";
    }
    
    public String formar(Aluno aluno){
        return "Aluno não pode formar";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno não pode trancar";
    }
    
    public String transferir(Aluno aluno){
        return "Aluno já pode transferir";
    }
    
    public String abandonar(Aluno aluno){
        return "Aluno já está abandonado";
    }
    
    public String jubilar(Aluno aluno){
        return "Aluno não pode jubilar";
    }
}
