package juegoPreguntasyRespuestas;

import java.util.Scanner;

/**
 *
 * @author FelipeQG
 */
public class Jugar {
    

    
    public static void main(String[] args) {
        String bienvenido = "Bienvenido al juego de Preguntas y Respuestas, elija una opcion";
        String menuInicial = "1. Iniciar Juego \n2. Ver Historico \n3. Salir";
        String mensajeNoValido = "Opcion no valida, saliendo..";
        String pideNombre = "Ingresa tu nombre: ";
        String pideApellido = "Ingresa tu Apellido";
        String almacenaNombre;
        String almacenaApellido;
        String imprimePregunta;
        int opcionMenu = 0; 
        Scanner sc = new Scanner(System.in);                                                                                        //Instanciamos lector de consola
        int responde;
        boolean evaluaRespuesta;
        String deseaContinuar = "¿Deseas Continuar ganando? \n1. Para continuar. \n0. Para salir con el acomulado hasta ahora";
        int continuar;
        int retiroVoluntario = 0;                                                                                                             //variable para la desicion de retiro voluntario
        int maximoPremio = 1500;
        int ronda = 0;
        
        //objetos a utilizar
        Usuario usuario ;
        Categoria categoria;
        Pregunta pregunta;
        Opcion opcion;
        Respuesta respuesta;
        Premio premio;
        Almacenamiento archivo;
        
        //menu inicial del juego
        do{
           System.out.println(bienvenido);
           System.out.println(menuInicial);
           opcionMenu = sc.nextInt();
           
        }while(opcionMenu == 0);
        
        //Evaluamos la eleccion del usuario
        archivo = new Almacenamiento();                                                                                                        //Instanciamos el archivo de almacenamiento
        if(opcionMenu == 1){
            System.out.println(pideNombre);
            almacenaNombre = sc.next();
            System.out.println(pideApellido);
            almacenaApellido = sc.next();
            usuario = new Usuario(almacenaNombre,almacenaApellido,0);                                                       //registramos el usuario
            categoria = new Categoria(usuario.getPuntos());                                                                            //Creamos la categoria
            pregunta = new Pregunta();
            opcion = new Opcion();
            respuesta = new Respuesta();
            premio = new Premio();
            
            do{
                categoria.elegirCategoria(usuario.getPuntos());                                                                         //calculamos la categoria segun los puntos del usuario
                premio.damePremio(categoria.getCategoria());                                                                            //calculamos el premio segun la categoria    
                imprimePregunta = pregunta.damePreguntaAleatoria(categoria.getCategoria());                                             //Pedimos una pregunta aleatoria
                System.out.println("RONDA : " + (ronda + 1));                                                                                   //Imprimimos la ronda en la que vamos
                System.out.println("CATEGORIA: " + categoria.getNombreCategoria() + "\n");
                System.out.println(imprimePregunta);                                                                                          //imprimimos la pregunta        
                System.out.println(opcion.dameOpciones(categoria.getCategoria(),pregunta.getId()));                            //imprimimos las opciones
                responde = sc.nextInt();                                                                                                         //Almacenamos la respuesta del usuario para evaluar si es verdadera               
                evaluaRespuesta = respuesta.dameRespuestaCorrecta(categoria.getCategoria(), pregunta.getId(), responde); //guardamos el resultado de la evaluacion de la respuesta
                
                if(evaluaRespuesta == true){                                                                                                    //condicional para evaluar en caso de respuesta correcta
                    System.out.println("Respuesta Correcta");                                                                   
                    usuario.setPuntos(usuario.getPuntos() + premio.getPremio());                                                                //Otorgamos premios, la cantidad segun la categoria en la que este
                    if(usuario.getPuntos() == maximoPremio){                                                                                    //evaluamos si esta en la ultima ronda
                        System.out.println("!!!!CAMPEON!!!!!");
                        System.out.println("TE LLEVAS UN TOTAL DE:  " + usuario.getPuntos() + " USD");
                        break;
                    }
                    
                    System.out.println("!!Ganas : " + premio.getPremio() + " USD, Acomulado: " + usuario.getPuntos() + " USD");                  
                    System.out.println(deseaContinuar);                                                                                      //Preguntamos al usuario si desea continuar o retirarse con el acomulado
                    continuar = sc.nextInt();
                    if(continuar == 1){
                        ronda++;
                        continue;
                    }else{
                        retiroVoluntario = 1;
                        break;
                    }
                }else{
                    System.out.println("Respuesta Incorrecta");
                    usuario.setPuntos(0);
                }       
            }while(evaluaRespuesta);
              System.out.println("Guardando...");
              archivo.escribiendo(usuario.getNombre(),usuario.getApellido(), usuario.getPuntos());             
              
        }else if(opcionMenu == 2){
            archivo.leyendo();
            
        }else if(opcionMenu == 3){
            System.out.println("Saliendo...");
        }else{
            System.out.println(mensajeNoValido);
        }
    }
    
}
