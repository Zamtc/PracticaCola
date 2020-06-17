package Ejercicio;
import java.util.Scanner;
public class Cola {
static Scanner teclado=new Scanner(System.in);
    int max;
    private int FRENTE;
    private int FINAL;
    Persona[]cola;//inicializando arreglo cola de tipo persona
    Persona per=new Persona();// creando un objeto
   
    public Cola(){//valores iniciales
        this.max=100;
        this.FRENTE=0;
        this.FINAL=0;
        this.cola=new Persona[this.max+1];
    } 
    
    public Cola(int max){
        this.max=max;
        this.FRENTE=0;
        this.FINAL=0;
        this.cola=new Persona[this.max+1];
    }
   
    public boolean IsColaLlena(){
        if(this.FINAL==this.max){
            return true;
        }else{
            return false;
        }
    }
    
     public boolean IsColaVacia(){
        if(this.FRENTE==this.FINAL){
            return true;
        }else{
            return false;
        }
        
    }
     
     public void InsertarCola(){
         if(this.IsColaLlena()){
             System.out.println("La Pila esta Llena");
         }else{
            System.out.println("Ingrese el Código de la persona: ");
            String codigo = teclado.next();
            per.setCodigo(codigo);
            System.out.println("Ingrese el Nombre de la persona : ");
            String nom = teclado.next();
            per.setNombre(nom);
            System.out.println("Ingrese la Tarifa "+ nom +" : ");
            double tarifa = teclado.nextDouble();
            per.setTarifa(tarifa);
            System.out.println("Ingrese las Horas Trabajadas "+ nom +" : ");
            int horas = teclado.nextInt();
            per.setHoras(horas);
            //System.out.println("Se inserto a la cola en la posicion\n" + (FINAL+1));
            System.out.println(per.Cadena());
            this.FINAL++;
            //this.cola[FINAL];  
            
         }
       
     }
      public void EliminarCola(){
         if(this.FRENTE==this.FINAL){
             System.out.println("La Cola está vacia");
                 
              }else{
             for(int i=FRENTE;i<=FINAL-1;i++){
                cola[i]=cola[i+1];  
         }
              this.FINAL--;
     }
      }
     
    
     public void MostrarCola(){
        
          if (IsColaVacia()) {
            System.out.println("La Cola esta vacía");
        }
         else {
             System.out.println("\tElementos de la cola");
             System.out.println("\t======================");
             for(int i=FRENTE+1;i<=FINAL;i++){
                 System.out.println(per.Cadena());
            }  
         }
         
     }     
}

