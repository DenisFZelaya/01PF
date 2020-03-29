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

    public producto(int idproducto, int stock, String nombreProducto, String descripcion, String categoria, double precio) 
        {
            this.idproducto = idproducto;
            this.stock = stock;
            this.nombreProducto = nombreProducto;
            this.descripcion = descripcion;
            this.categoria = categoria;
            this.precio = precio;
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

                    public String getSprecio()
            {
                String Sprecio;
                 Sprecio = String.valueOf(this.precio);
                return Sprecio;
            }

             public String getSnombreProd()
            {
                String getSnombreProd;
                 getSnombreProd = this.nombreProducto;
                return getSnombreProd;
            }     


                 public String getSdescripProd()
            {
                String descripProd;
                 descripProd = this.descripcion;
                return descripProd;
            }     
                  public String getSCategoria()
            {
                String SCategoria;
                 SCategoria = this.categoria;
                return SCategoria;
            }                 
                 
                 
                 

            public int getIdproducto() {
                return idproducto;
            }

            public void setIdproducto(int idproducto) {
                this.idproducto = idproducto;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public String getNombreProducto() {
                return nombreProducto;
            }

            public void setNombreProducto(String nombreProducto) {
                this.nombreProducto = nombreProducto;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }

            public String getCategoria() {
                return categoria;
            }

            public void setCategoria(String categoria) {
                this.categoria = categoria;
            }

            public double getPrecio() {
                return precio;
            }

            public void setPrecio(double precio) {
                this.precio = precio;
            }

}
