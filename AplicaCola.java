package Ejercicio;
import java.util.Scanner;
public class AplicaCola {
 static Scanner teclado=new Scanner(System.in);
    public static Cola Cola;
    public static void main (String args[]){
    MenuCola();
}
static void creaCola(){
    int tam;
    System.out.print("Ingrese Tamaño de la Cola: ");
    tam=teclado.nextInt();
    Cola=new Cola(tam);
    System.out.println("cola creada....\n");
}
    static void MenuCola(){
        int opcion; 
        
        do{
            System.out.println("========================");
            System.out.println("\nMenú de Opciones");
            System.out.println("===========================");
            System.out.println("[1] Crear Cola");
            System.out.println("[2] Insertar Datos");
            System.out.println("[3] Eliminar Datos");
            System.out.println("[4] Mostrar Datos");
            System.out.println("=============================");
            System.out.println("[0] Salir");
            
            System.out.print("\nIngrese una Opción: ");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1 : 
                    creaCola();
                    break;
                case 2 : 
                    Cola.InsertarCola();
                    break;
                case 3 : 
                    Cola.EliminarCola();
                    break;
                case 4 : 
                    Cola.MostrarCola();
                    break;
                case 0 : 
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opción Correcta....");
                    System.out.println("\n");
            }
        } while (opcion!=0);
    }
}
            