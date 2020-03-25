
public class usuario {
    private String nombre="",usuario="",contraseña="", identidad= "";
    private int salario=0;

    public usuario() {
    }
    
    public usuario(String pnombre, String pusuario, String pcontraseña, String pidentidad, int psalario) {
        this.nombre=pnombre;
        this.usuario=pusuario;
        this.contraseña=pcontraseña;
        this.identidad=pidentidad;
        this.salario=psalario;
    }

    //set y get para cada atributo
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    
    
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String pusuario) {
        this.usuario = pusuario;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String pcontraseña) {
        this.contraseña = pcontraseña;
    }

    public String getIdentidad() {
        return this.identidad;
    }

    public void setIdentidad(String pidentidad) {
        this.identidad = pidentidad;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int psalario) {
        this.salario = psalario;
    }
    
    
    
}
