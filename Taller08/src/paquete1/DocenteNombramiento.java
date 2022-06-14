/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author M S I
 */
public class DocenteNombramiento extends Docente {

    private double sueldo;
    private double valorHoraExtra;
    private double numeroHorasExtras;
    private double sueldoFinal;

    public void establecerSueldo(double a) {
        sueldo = a;
    }

    public void establecerValorHoraExtra(double a) {
        valorHoraExtra = a;
    }

    public void establecerNumeroHorasExtras(double a) {
        numeroHorasExtras = a;
    }

    public void calcularSueldoFinal() {
        sueldoFinal = sueldo + (valorHoraExtra * numeroHorasExtras);
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public double obtenerNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("--------------- REPORTE DEL NOMBRAMIENTO DOCENTE "
                + "------------------\n"
                + "Nombre: %s.\n"
                + "Cedula: %s.\n"
                + "Sueldo: %.2f.\n"
                + "Numero de horas extra: %.2f.\n"
                + "Valor de cada hora extra : %.2f.\n"
                + "Sueldo a cancelar: %.2f.\n"
                + "-------------------------------------------------------------"
                + "------",
                nombre,
                cedula,
                sueldo,
                numeroHorasExtras,
                valorHoraExtra,
                sueldoFinal);
        return cadena;
    }

}
