
public class contabilidad {
    private int inversion = 0, ingreso = 0, ganancia = 0;
    private String mes = "";

    //Constructor vacio
    public contabilidad(){
    }
    
    //Constructor para capturar datos
    public contabilidad (String mes, int inversion,int ingreso){
    this.mes = mes;
    this.inversion = inversion;
    this.ingreso = ingreso;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
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

    public int getGanancia() {
        this.ganancia = this.ingreso - this.inversion;
        
        return ganancia;
    }
 
}
