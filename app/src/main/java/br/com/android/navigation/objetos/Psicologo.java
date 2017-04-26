package br.com.android.navigation.objetos;

/**
 * Created by debor on 22/04/2017.
 */

public class Psicologo {
    private String nomePsicologo;
    private int nadvertencias;
    private String consultas;
    private String email;
    private boolean status;
    private String advertencia;
    private String aluno;

    public String getNomePsicologo() {
        return nomePsicologo;
    }

    public void setNomePsicologo(String nomePsicologo) {
        this.nomePsicologo = nomePsicologo;
    }

    public int getNadvertencias() {
        return nadvertencias;
    }

    public void setNadvertencias(int nadvertencias) {
        this.nadvertencias = nadvertencias;
    }

    public String getConsultas() {
        return consultas;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
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
    public String getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(String advertencia) {
        this.advertencia = advertencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void criarAdvertencia(){

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
}
