/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.sql.Date;

/**
 *
 * @author Casa
 */
public class Venta {
     private String fecha;
    private int id_vendedor;
    private int monto;
    private String sucursal;

    public Venta(String fecha, int id, int monto, String sucursal) {
        this.fecha = fecha;
        this.id_vendedor = id_vendedor;
        this.monto = monto;
        this.sucursal = sucursal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id_vendedor;
    }

    public void setId(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
            
}
