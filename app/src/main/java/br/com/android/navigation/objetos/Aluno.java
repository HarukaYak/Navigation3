package br.com.android.navigation.objetos;


public class Aluno {
    private String nomeAluno;
    private int faltas;
    private int presenca;
    private String advertencias;
    private int nadvertencias;
    private boolean status;
    private boolean turno;

    public String getNomeAluno(){
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public int getFaltas(){
        return faltas;
    }

    public void setFaltas(int faltas){
        this.faltas = faltas;
    }

    public int getPresenca(){
        return presenca;
    }

    public void setPresenca(int presenca){
        this.presenca = presenca;
    }

    public String getAdvertencias(){
        return advertencias;
    }

    public void setAdvertencias(String advertencias){
        this.advertencias = advertencias;
    }

    public int getNadvertencias(){
        return nadvertencias;
    }

    public void setNadvertencias(int nadvertencias){
        this.nadvertencias = nadvertencias;
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

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void matutino(){
        turno = true;
    }

    public void vespertino(){
        turno = false;
    }


}
