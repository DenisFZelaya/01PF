
//class Triangulo extends DosDimensiones
class cajero extends usuario {
    private int idCajero=0;
    private String turno="";

    public cajero() {
    }
    
    public cajero(int pidCajero, String pturno) {
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
        
    
        public String getinformacion ()
    {
        String datos = "";
        datos = "Nombre: "+this.getNombre()+"\n"
                + "Salario: "+this.getSalario()+"\n"
                + "Id Cajero: "+this.idCajero+"\n"
                + "Turno: "+this.turno+"\n";    
        return datos;
    }

    
}
