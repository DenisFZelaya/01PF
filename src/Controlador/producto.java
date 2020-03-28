/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/**
 *
 * @author Cristian Maradiaga
 */
public class producto {
    private int idproducto, stock;
    private String nombreProducto, descripcion, categoria;
    private double precio;
    
    public producto()
    {
        
    }
    
    public producto(int pidproducto, int pstock, String pnombreProducto,
            String pdescripcion, String pcategoria, double pprecio)
    {
        this.idproducto=pidproducto;
        this.stock=pstock;
        this.nombreProducto=pnombreProducto;
        this.descripcion=pdescripcion;
        this.categoria=pcategoria;
        this.precio=pprecio;
        
    }
    
    public String getInformacion()
    {
    String datos="";
    datos=  "Id Producto:   "+this.idproducto+"\n"+
            "Cantidad en Stock:    "+this.stock+"\n"+
            "Nombre del Producto:       "+this.nombreProducto+"\n"+
            "Descripcion:            "+this.descripcion+"\n"+
            "Categoria:      "+this.categoria+"\n"+
            "Precio:        "+this.precio;
            
    return datos;
            
    }
    
    public void setidproducto(int pidproducto)
    {
    this.idproducto=pidproducto;
    }
    
    public int getidproducto()
    {
      return this.idproducto;  
    }
    
    //Conversion de Entero a String
    public String getSidproducto()
    {
        String StringProducto;
         StringProducto = String.valueOf(this.idproducto);
        return StringProducto;
    }
    
        public String getSstock()
    {
        String Sstock;
         Sstock = String.valueOf(this.stock);
        return Sstock;
    }
    
    public void setstock(int pstock)
    {
    this.stock=pstock;
    }
    
    public int getstock()
    {
      return this.stock;  
    }
    
    public void setnombreproducto(String pnombreproducto)
    {
    this.nombreProducto=pnombreproducto;
    }
    
    public String getnombreproducto()
    {
      return this.nombreProducto;  
    }
    
    public void setdescripcion(String pdescripcion)
    {
    this.descripcion=pdescripcion;
    }
    
    public String getdescripcion()
    {
      return this.descripcion;  
    }
    
    public void setcategoria(String pcategoria)
    {
    this.categoria=pcategoria;
    }
    
    public String getcategoria()
    {
      return this.categoria;  
    }
    
    public void setprecio(double  pprecio)
    {
    this.precio=pprecio;
    }
    
    public double getprecio()
    {
      return this.precio;  
    }
    
}
