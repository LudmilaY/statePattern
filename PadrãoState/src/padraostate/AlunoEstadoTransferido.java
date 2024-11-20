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
public class AlunoEstadoTransferido implements AlunoEstado{
    
    public String getEstado(){
        return "Transferido";
    }
    
    public String matricular(Aluno aluno){
        return "Matrícula não efetuada uma vez que o aluno está transferido";
    }
    
    public String formar(Aluno aluno){
        return "Aluno não pode formar";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno não pode trancar";
    }
    
    public String transferir(Aluno aluno){
        return "Aluno não pode transferir";
    }
    
    public String abandonar(Aluno aluno){
        return "Aluno não pode abandonar";
    }
    
    public String jubilar(Aluno aluno){
        return "Aluno não pode jubilar";
    }
}
