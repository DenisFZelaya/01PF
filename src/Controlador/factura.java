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
public class factura {
    double total;
    
 
public double gettotal(double subtotal, double isv)
{
    total = subtotal + isv;
    
    return this.total;
}


}
