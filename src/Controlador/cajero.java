package Controlador;
//class Triangulo extends DosDimensiones
public class cajero extends usuario {
    private int idCajero=0;
    private String turno="";

    public cajero() {
    }
    
    public cajero(String pnombre, String pusuario, String pidentidad, String pcontraseña, int psalario,int pidCajero, String pturno) {
        super(pnombre,pusuario,pcontraseña,pidentidad,psalario);
        this.idCajero=pidCajero;
        this.turno=pturno;
    }

    public int getIdCajero() {
        return this.idCajero;
    }

    public void setIdCajero(int pidCajero) {
        this.idCajero = pidCajero;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String pturno) {
        this.turno = pturno;
    }

    
}
