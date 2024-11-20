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
public class AlunoEstadoMatriculado implements AlunoEstado{
    
    public String getEstado(){
        return "Matriculado";
    }
    
    public String matricular(Aluno aluno){
        return "Matrícula não efetuada uma vez que o aluno já está matriculado";
    }
    
    public String formar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoFormado());
        return "Aluno já pode formar";
    }
    
    public String trancar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoTrancado());
        return "Aluno já pode trancar";
    }
    
    public String transferir(Aluno aluno){
        aluno.setEstado(new AlunoEstadoTransferido());
        return "Aluno já pode transferir";
    }
    
    public String abandonar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoAbandonado());
        return "Aluno já pode abandonar";
    }
    
    public String jubilar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno já pode jubilar";
    }
}
