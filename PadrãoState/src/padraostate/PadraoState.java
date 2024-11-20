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
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Grupinho");
        aluno.setEstado(new AlunoEstadoMatriculado());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.matricular());
        aluno.setEstado(new AlunoEstadoFormado());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.formar());
        aluno.setEstado(new AlunoEstadoTrancado());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.trancar());
        aluno.setEstado(new AlunoEstadoTransferido());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.transferir());
        aluno.setEstado(new AlunoEstadoJubilado());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.jubilar());
        aluno.setEstado(new AlunoEstadoAbandonado());
        System.out.println ("Aluno " + aluno.getNome() + " está no estado" 
                + aluno.getNomeEstado() + "-" + aluno.abandonar());
        
    }
    
}
