package br.com.android.navigation.objetos;

/**
 * Created by debor on 22/04/2017.
 */

public class Gestor{

    private String nomeGestor;
    private String professor;
    private String coordenador;
    private String psicologo;
    private String assistenteS;
    private String aluno;
    private String advertencia_aluno;
    private int nadvertencia_aluno;
    private int nadvertencia_professor;
    private int nadvertencia_psicologo;
    private int nadvertencia_coordenador;
    private int nadvertencia_assistente;
    private boolean status;



    public String getNomeGestor() {
        return nomeGestor;
    }

    public void setNomeGestor(String nomeGestor) {
        this.nomeGestor = nomeGestor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
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

    public String getAdvertencia_aluno() {
        return advertencia_aluno;
    }

    public void setAdvertencia_aluno(String advertencia_aluno) {
        this.advertencia_aluno = advertencia_aluno;
    }

    public int getNadvertencia_aluno() {
        return nadvertencia_aluno;
    }

    public void setNadvertencia_aluno(int nadvertencia_aluno) {
        this.nadvertencia_aluno = nadvertencia_aluno;
    }

    public int getNadvertencia_professor() {
        return nadvertencia_professor;
    }

    public void setNadvertencia_professor(int nadvertencia_professor) {
        this.nadvertencia_professor = nadvertencia_professor;
    }

    public int getNadvertencia_psicologo() {
        return nadvertencia_psicologo;
    }

    public void setNadvertencia_psicologo(int nadvertencia_psicologo) {
        this.nadvertencia_psicologo = nadvertencia_psicologo;
    }

    public int getNadvertencia_coordenador() {
        return nadvertencia_coordenador;
    }

    public void setNadvertencia_coordenador(int nadvertencia_coordenador) {
        this.nadvertencia_coordenador = nadvertencia_coordenador;
    }

    public int getNadvertencia_assistente() {
        return nadvertencia_assistente;
    }

    public void setNadvertencia_assistente(int nadvertencia_assistente) {
        this.nadvertencia_assistente = nadvertencia_assistente;
    }

    public void online(){
        status = true;

    }

    public void off(){
        status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
