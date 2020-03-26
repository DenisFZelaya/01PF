/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
/**
 *
 * @author Cristian Maradiaga
 */
public class cliente {
    private int idcliente;
    private String nombreCliente, telefono;
    
    public cliente()
    {
        
    }
    
    public cliente(int pidcliente, String pnombreCliente, String ptelefono)
    {
        this.idcliente=pidcliente;
        this.nombreCliente=pnombreCliente;
        this.telefono=ptelefono;
    }
    
    public String getInformacion()
    {
    String info="";
    info=  "Id Cliente:   "+this.idcliente+"\n"+
            "Nombre de Cliente:    "+this.nombreCliente+"\n"+
            "Telefono:       "+this.telefono;
            
    return info;
            
    }
    
    public void setidcliente(int pidcliente)
    {
    this.idcliente=pidcliente;
    }
    
    public int getidcliente()
    {
      return this.idcliente;  
    }
    
    public void setnombreCliente(String pnombreCliente)
    {
    this.nombreCliente=pnombreCliente;
    }
    
    public String getnombreCliente()
    {
      return this.nombreCliente;  
    }
    
    public void settelefono(String ptelefono)
    {
    this.telefono=ptelefono;
    }
    
    public String gettelefono()
    {
      return this.telefono;  
    }
    
}
