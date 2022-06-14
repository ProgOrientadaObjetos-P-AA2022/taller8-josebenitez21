/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author M S I
 */
public class DocenteFactura extends Docente {

    private double ValorFactura;
    private double ValorIvaDescuento;
    private double ValorCancelar;

    public void establecerValorFactura(double a) {
        ValorFactura = a;
    }

    public void establecerValorIvaDescuento(double a) {
        ValorIvaDescuento = a;
    }

    public void calcularValorCancelar() {
        ValorCancelar = ValorFactura - (ValorFactura * ValorIvaDescuento) / 100;
    }

    public double obtenerValorFactura() {
        return ValorFactura;
    }

    public double obtenerValorIvaDescuento() {
        return ValorIvaDescuento;
    }

    public double obtenerValorCancelar() {
        return ValorCancelar;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("--------------- REPORTE DE FACTURA "
                + "------------------\n"
                + "Nombre: %s.\n"
                + "Cedula: %s.\n"
                + "Valor de la factura: %.2f.\n"
                + "Porcentaje de IVA a descontar: %.2f.\n"
                + "Valor a Cancelar : %.2f.\n"
                + "------------------------------------------------------",
                nombre,
                cedula,
                ValorFactura,
                ValorIvaDescuento,
                ValorCancelar);
        return cadena;
    }
}
