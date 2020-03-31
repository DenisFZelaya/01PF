/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author admin
 */
public class administrador extends usuario{
    int codigo=0;
    String especializacion="";

    public administrador(String nombre, String usuario, String contraseña, String identidad, int salario ,int pcodigo, String pespecializacion)
    {
        super(nombre, usuario, contraseña, identidad, salario);
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
    
    //CONVERTIR SALARIO Y CODIGO EN STRING
    public String getSsalario()
    {
          String sal;
          sal = String.valueOf(this.salario);
          return sal;
    }
    
    public String getScodigo(){
        String cod;
        cod = String.valueOf(this.codigo);
        return cod;
    }
}
