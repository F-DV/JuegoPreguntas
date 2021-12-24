package juegoPreguntasyRespuestas;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FelipeQG
 */
public class Almacenamiento {
    
    String nombre;
    String apellido;
    int acomulado;
    int lector;
      
    public Almacenamiento(){      
    }
    //C://Users//User//Documents//NetBeansProjects//ProyectosFelipe//TiendaBotstore//Sofka//juego.txt"
    public void escribiendo(String nombre,String apellido,int acomulado){        
        try{
            FileWriter escribir = new FileWriter("src//juegoPreguntasyrespuestas//juego.txt",true);
            escribir.write("Nombre: " + nombre + " , Apellido: " + apellido + " , Premio: " + acomulado + " USD" + "\n");
            escribir.close();
            
            System.out.println("Se guardo con exito");
        }catch(IOException e){
            System.out.println("Error al Guardar");
        }    
    }
    
    public void leyendo(){
        try{
            FileReader leer = new FileReader("src//juegoPreguntasyrespuestas//juego.txt"); 
            
            while(lector != -1){                //dado que lee codigo numerico, debemos convertir todos en caracteres
            
            lector = leer.read();               //leemos un codigo
            
            char convierte = (char)lector;      //lo convertimos a caracter
            
            System.out.print(convierte);      //imprimir cada caracter
        }
            
        }catch(IOException e){
            System.out.println("No se encontro Archivo");
        }
        
    }
    
}
