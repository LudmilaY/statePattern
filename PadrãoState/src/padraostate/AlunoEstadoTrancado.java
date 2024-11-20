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
public class AlunoEstadoTrancado implements AlunoEstado{
    
    public String getEstado(){
        return "Trancado";
    }
    
    public String matricular(Aluno aluno){
        aluno.setEstado(new AlunoEstadoMatriculado());
        return "Matrícula feita";
    }
    
    public String formar(Aluno aluno){
        return "Aluno não pode formar";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno já está trancado";
    }
    
    public String transferir(Aluno aluno){
        aluno.setEstado(new AlunoEstadoTransferido());
        return "Aluno pode transferir";
    }
    
    public String abandonar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoAbandonado());
        return "Aluno pode abandonar";
    }
    
    public String jubilar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno pode jubilar";
    }
}
