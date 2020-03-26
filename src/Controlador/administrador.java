/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author admin
 */
public class administrador extends usuario{
    int codigo=0;
    String especializacion="";
    
    
    public administrador()
    {
        super();
    }
          
    public administrador(int pcodigo, String pespecializacion)
    {
        this.codigo = pcodigo;
        this.especializacion = pespecializacion;
    }
    
    public void setcodigo(int pcodigo)
    {
        this.codigo = pcodigo;
    }
    
    public int getcodigo()
    {
        return this.codigo;
    }
    
    public void setespecializacion(String pespecializacion)
    {
        this.especializacion = pespecializacion;
    }
    
    public String getespecializacion()
    {
        return this.especializacion;
    }
}
