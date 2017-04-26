package br.com.android.navigation.objetos;

/**
 * Created by debor on 22/04/2017.
 */

public class Professor {
    private String nomeProfessor;
    private String materia;
    private String turma;
    private int advertencias;
    private boolean status;
    private String aluno;
    private String email;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getAdvertencias() {
        return advertencias;
    }

    public void setAdvertencias(int advertencias) {
        this.advertencias = advertencias;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void online(){
        status = true;
    }

    public void off(){
        status = false;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
