package br.com.android.navigation.objetos;

/**
 * Created by debor on 22/04/2017.
 */

public class AssistenteS {
    private String nomeAssistente;
    private String advertencias;
    private String visitas;
    private String aluno;
    private boolean status;
    private String email;
    private int datanasc;


    public String getNomeAssistente() {
        return nomeAssistente;
    }

    public void setNomeAssistente(String nomeAssistente) {
        this.nomeAssistente = nomeAssistente;
    }

    public String getAdvertencias() {
        return advertencias;
    }

    public void setAdvertencias(String advertencias) {
        this.advertencias = advertencias;
    }

    public String getVisitas() {
        return visitas;
    }

    public void setVisitas(String visitas) {
        this.visitas = visitas;
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

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
