/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import proyecto.*;
import java.util.Scanner;

/**
 *
 * @author luckm
 */
public class Evento {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getnBoletas() {
        return nBoletas;
    }

    public void setnBoletas(int nBoletas) {
        this.nBoletas = nBoletas;
    }

    private String name;
    private int month;
    private int day;
    private int year;
    private int nBoletas;
    Scanner sc = new Scanner(System.in);

    public Evento(String name, int year, int month, int day, int nBoletas) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
        this.nBoletas = nBoletas;
    }

    public BinaryNode vender(BinaryNode o) {

        return o;
    }

    public Evento createEvento() {
        String n; //Nombre
        int m; //Mes
        int d; //Día
        int y; //Año
        int b; //Numero de boletas
        int option;
        System.out.println("Ingrese el titulo del evento:");
        n = sc.next();
        System.out.println("\n");
        System.out.println("Ingrese el año del evento: ");
        y = sc.nextInt();
        System.out.println("\n");
        System.out.println("Ingrese el mes del evento en numeros: ");
        m = sc.nextInt();
        System.out.println("Ingrese el dia del evento: ");
        d = sc.nextInt();
        System.out.println("Ingrese el numero de boletas disponibles para la venta: ");
        b = sc.nextInt();

        System.out.println("Nombre: " + n + "\n");
        System.out.println("Fecha: " + d + "/" + m + "/" + y);
        System.out.println("Numero de boletas: " + b);

        System.out.println("Si la informacion es correcta presione [1]");
        System.out.println("De lo contrario presione [2] para volver a comenzar");

        option = sc.nextInt();

        switch (option) {
            case 1:
                Evento newEvento = new Evento(n, y, m, d, b);
                System.out.println("Evento creado!");
                return newEvento;
            case 2:
                return createEvento();
            default:
                System.out.println("Comando incorecto, vuelva a intentarlo...");
                return createEvento();
        }

    }
     MyArrayList<Evento> listaEventos = new MyArrayList<>();
      Evento filarmonica = new Evento("Filarmonica de Bogotá", 2019, 4, 1, 200);
        Evento congresoFis = new Evento("Congreso de Fisica", 2019, 5, 14, 100);
    private void pre_added(){
       listaEventos.add(0, filarmonica);
        listaEventos.add(1,congresoFis);
       
    }

    public void verEventos() {
        pre_added();
        
    }

}
