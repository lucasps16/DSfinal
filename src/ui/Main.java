package ui;
import proyecto.*;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Peña Salas
 */
public class Main {

    public static void seleccionar(){
        Evento e = new Evento("", 0, 0, 0, 0);
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("!!Bienvenido al sistema de venta de boletas!!"); 
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("[1] Crear nuevo evento.");
        System.out.println("[2] Ver eventos disponibles.");
        System.out.println("[3] Buscar Boleta por fila y silla.");
        System.out.println("[4] Buscar Boleta por ID.");
        System.out.println("[5] Historial de comandos.");
        System.out.println("[0] Salir.");
        option = sc.nextInt();
        switch (option) {
            case 1:
                e.createEvento();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5: 
                break;
            case 0:
                return;
            default:
                System.out.println("Comando incorrecto, vuelva a intentarlo...");
                seleccionar();
                break;
        }
        
    }
    
    public static void buscarBoleta(){
        
    }
    
    
    public static void main(String[] args) {
        
        
    }
    
}
