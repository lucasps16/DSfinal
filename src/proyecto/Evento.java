/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Scanner;
/**
 *
 * @author luckm
 */
public class Evento {
    
    String name;
    int month;
    int day;
    int year;
    int nBoletas;
    Scanner sc = new Scanner(System.in);

    public Evento(String name, int year, int month, int day, int nBoletas) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
        this.nBoletas = nBoletas;
    }
    
    public BinaryNode vender(BinaryNode o){
        
        return o;
    }
    
    public Evento createEvento(){
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
        System.out.println("Fecha: " + d + "/" + m + "/" + y );
        System.out.println("Numero de boletas: " +  b);
        
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
    
    
    public void verEvento(LinkedList e){
        
    }
    
    
    
    
     
    
    
}
