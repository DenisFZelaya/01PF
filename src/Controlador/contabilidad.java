package Controlador;


public class contabilidad {
    private int inversion = 0, ingreso = 0, ganancia = 0, idmes=0;
    private String mes = "", año="";

    //Constructor vacio
    public contabilidad(){
    }
    
    //Constructor para capturar datos
    public contabilidad (int idmes, String mes, String año, int inversion,int ingreso, int ganancia){
    this.idmes = idmes;
    this.mes = mes;
    this.año = año;
    this.inversion = inversion;
    this.ingreso = ingreso;
    this.ganancia = ganancia;
    }

    public int getidMes() {
        return idmes;
    }

    public void setMes(int idmes) {
        this.idmes = idmes;
    }
    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    public int getGanancia() {
        return ganancia;
    }
 
}
