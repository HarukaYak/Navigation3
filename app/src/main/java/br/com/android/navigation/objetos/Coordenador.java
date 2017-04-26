package br.com.android.navigation.objetos;

/**
 * Created by debor on 22/04/2017.
 */

public class Coordenador {
    private String nomeCoordenador;
    private String professor;
    private String psicologo;
    private String assistenteS;
    private String aluno;
    private boolean status;
    private int nadvertencias;
    private String relatorios;
    private String providencias;
    private String email;

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(String psicologo) {
        this.psicologo = psicologo;
    }

    public String getAssistenteS() {
        return assistenteS;
    }

    public void setAssistenteS(String assistenteS) {
        this.assistenteS = assistenteS;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
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

    public int getNadvertencias() {
        return nadvertencias;
    }

    public void setNadvertencias(int nadvertencias) {
        this.nadvertencias = nadvertencias;
    }

    public String getRelatorios() {
        return relatorios;
    }

    public void setRelatorios(String relatorios) {
        this.relatorios = relatorios;
    }

    public String getProvidencias() {
        return providencias;
    }

    public void setProvidencias(String providencias) {
        this.providencias = providencias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
