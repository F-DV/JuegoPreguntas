package juegoPreguntasyRespuestas;
/**
 *
 * @author FelipeQG
 */
public class Respuesta {
    
    private int nCategoria;
    private int nPregunta;
    private int nRepuesta;
    private boolean swiche = false;
    
    public Respuesta(int nCategoria,int nPregunta, int nRespuesta){
        
        this.nCategoria = nCategoria;
        this.nPregunta = nPregunta;
        this.nRepuesta = nRespuesta;
    }
    public Respuesta(){
        
    }
    
    public boolean dameRespuestaCorrecta(int categoria,int pregunta,int respuesta){
              
        if(categoria == 1 && pregunta == 1 && respuesta == 1){
            swiche = true;
        }else if(categoria == 1 && pregunta == 2 && respuesta == 2){
            swiche = true;
        }else if(categoria == 1 && pregunta == 3 && respuesta == 2){
            swiche = true; 
        }else if(categoria == 1 && pregunta == 4 && respuesta == 4){
            swiche = true;
        }else if(categoria == 1 && pregunta == 5 && respuesta == 4){
            swiche = true;
        }else if(categoria == 2 && pregunta == 1 && respuesta == 4){
            swiche = true;            
        }else if(categoria == 2 && pregunta == 2 && respuesta == 3){
            swiche = true;
        }else if(categoria == 2 && pregunta == 3 && respuesta == 3){
            swiche = true;
        }else if(categoria == 2 && pregunta == 4 && respuesta == 2){
            swiche = true;
        }else if(categoria == 2 && pregunta == 5 && respuesta == 4){
            swiche = true;
        }else if(categoria == 3 && pregunta == 1 && respuesta == 1){
            swiche = true;
        }else if(categoria == 3 && pregunta == 2 && respuesta == 3){
            swiche = true;
        }else if(categoria == 3 && pregunta == 3 && respuesta == 2){
            swiche = true;
        }else if(categoria == 3 && pregunta == 4 && respuesta == 1){
            swiche = true;
        }else if(categoria == 3 && pregunta == 5 && respuesta == 3){
            swiche = true;
        }else if(categoria == 4 && pregunta == 1 && respuesta == 1){
            swiche = true;
        }else if(categoria == 4 && pregunta == 2 && respuesta == 1){
            swiche = true;
        }else if(categoria == 4 && pregunta == 3 && respuesta == 1){
            swiche = true;
        }else if(categoria == 4 && pregunta == 4 && respuesta == 4){
            swiche = true;
        }else if(categoria == 4 && pregunta == 5 && respuesta == 4){
            swiche = true;
        }else if(categoria == 5 && pregunta == 1 && respuesta == 3){
            swiche = true;
        }else if(categoria == 5 && pregunta == 2 && respuesta == 2){
            swiche = true;
        }else if(categoria == 5 && pregunta == 3 && respuesta == 1){
            swiche = true;
        }else if(categoria == 5 && pregunta == 4 && respuesta == 2){
            swiche = true;
        }else if (categoria == 5 && pregunta == 5 && respuesta == 4){
            swiche = true;
        }else{
            swiche = false;
        }
        return swiche;
    }
    

    
}
