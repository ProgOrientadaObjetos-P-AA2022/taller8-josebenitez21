/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String option;
        String mensaje;
        String nombreDocen;
        String cedula;

        System.out.println("Ingresa 1 para introducir datos de Estudiante Presencial"
                + "o 2 para introducir datos de Estudiante a Distancia ");
        option = entrada.nextLine();

        if (option.equals("1") || option.equals("2")) {

            System.out.println("Bienvenido a nuestra Plataforma de Informacion\n");
            System.out.println("Ingrese su nombre");
            nombreDocen = entrada.nextLine();

            System.out.println("Ingrese su Identifiacion");
            cedula = entrada.nextLine();

            switch (option) {
                case "1":
                    mensaje = nombramiento(nombreDocen, cedula);
                    System.out.println(mensaje);
                    break;
                case "2":
                    mensaje = factura(nombreDocen, cedula);
                    System.out.println(mensaje);
                    break;

                default:

            }
        } else {
            System.out.println("Error, opcion no valida.");
        }

    }

    public static String nombramiento(String nombreDocen, String cedula) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        DocenteNombramiento nombramientoDo = new DocenteNombramiento();
        double sueldoN;
        double valorHoraExtraN;
        double numeroHorasExtrasN;
        //double sueldoFinalN;

        System.out.println("Ingrese el sueldo del docente");
        sueldoN = entrada.nextDouble();
        System.out.println("Ingrese el valor de las horas extras");
        valorHoraExtraN = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de horas extras laboradas");
        numeroHorasExtrasN = entrada.nextDouble();

        nombramientoDo.establecerNombre(nombreDocen);
        nombramientoDo.establecerCedula(cedula);
        nombramientoDo.establecerSueldo(sueldoN);
        nombramientoDo.establecerValorHoraExtra(valorHoraExtraN);
        nombramientoDo.establecerNumeroHorasExtras(numeroHorasExtrasN);
        nombramientoDo.calcularSueldoFinal();

        String cadena;
        cadena = String.format("%s\n", nombramientoDo);
        return cadena;

    }

    public static String factura(String nombreDocen, String cedula) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        DocenteFactura facturaDo = new DocenteFactura();

        double ValorFacturaF;
        double ValorIvaDescuentoF;
        double ValorCancelarF;

        System.out.println("Ingrese el valor de la Factura");
        ValorFacturaF = entrada.nextDouble();
        System.out.println("Ingrese el valor del iva a descontar");
        ValorIvaDescuentoF = entrada.nextDouble();

        facturaDo.establecerNombre(nombreDocen);
        facturaDo.establecerCedula(cedula);
        facturaDo.establecerValorFactura(ValorFacturaF);
        facturaDo.establecerValorIvaDescuento(ValorIvaDescuentoF);
        facturaDo.calcularValorCancelar();

        String cadena;
        cadena = String.format("%s\n", facturaDo);
        return cadena;
    }
}
