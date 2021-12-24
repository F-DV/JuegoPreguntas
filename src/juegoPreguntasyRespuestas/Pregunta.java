package juegoPreguntasyRespuestas;

import java.util.ArrayList;

/**
 *
 * @author FelipeQG
 */
public class Pregunta {
    
    private int id; //id de la pregunta
    private String pregunta;
    private int categoria;
    private int aleatorio;
    private String imprimir;
    private ArrayList<Pregunta> listado = new ArrayList<Pregunta>();
    
    public Pregunta(int categoria,int id,String pregunta){
        this.categoria = categoria;
        this.id = id;
        this.pregunta = pregunta;
        
    }
      
    //realizamos una sobre carga de constructores ya que el vacio lo necesitamos para la instancia en Jugar
    public Pregunta(){
        crearPreguntas();        
    }
    
    //Generamos pregunta aleatoria
    public String damePreguntaAleatoria(int categoria){
        
        this.categoria = categoria;
        
        //Creamos el Random para la pregunta
        aleatorio = (int) (Math.random() * 5 + 1);
        
        id = aleatorio; //almacenamos el aleatorio en el id de la pregunta osea numero de pregunta
        
        
        for(int i=0;i<=listado.size();i++){
                       
            if(listado.get(i).getCategoria() == categoria && listado.get(i).getId() == aleatorio){ //si es la categoria indicada y el numero de la pregunta aleatoria
                                           
                imprimir = listado.get(i).getPregunta();
                break;               
            }
        }
        
        return imprimir;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
       
    public int getCategoria(){
        
        return categoria;
    }
    
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
    public int getId(){
        
        return id;
    }
    
    public void setId(int id){
        
        this.id = id;
    }
    
    public void crearPreguntas(){
        
        Pregunta pregunta1 = new Pregunta(1,1,"¿Cuantos estados tiene integrado Estados Unidos?"); //50 estados
        Pregunta pregunta2 = new Pregunta(1,2,"¿De que pais forma parte hawai?"); //estados unidos
        Pregunta pregunta3 = new Pregunta(1,3,"¿Quien descubrio America?");//cristobal colon
        Pregunta pregunta4 = new Pregunta(1,4,"¿Capital de colombia?");//Bogota
        Pregunta pregunta5 = new Pregunta(1,5,"¿Capital de España?");//madrid
        
        Pregunta pregunta6 = new Pregunta(2,1,"¿En que año acabo la segunda guerra mundia?");//1945
        Pregunta pregunta7 = new Pregunta(2,2,"¿como murio Hitler?");//se suicido
        Pregunta pregunta8 = new Pregunta(2,3,"¿En que año Comenzo la segunda guerra mundial?");//1939 
        Pregunta pregunta9 = new Pregunta(2,4,"¿Primer pais invadido por parte de alemania?");//Polonia
        Pregunta pregunta10 = new Pregunta(2,5,"¿Cómo se llamaba el avión que transportó la bomba atómica que se lanzó sobre Hiroshima?");//Enola gay
    
        Pregunta pregunta11 = new Pregunta(3,1,"¿Por qué es famosa Marie Curie?"); //Radioactividad
        Pregunta pregunta12 = new Pregunta(3,2,"¿Qué significan las siglas ADN?");//Acido desoxirribonucleico 
        Pregunta pregunta13 = new Pregunta(3,3,"¿En que galaxia se encuentra la tierra?");//via lactea
        Pregunta pregunta14 = new Pregunta(3,4,"¿Cómo se le llama al proceso de división celular para formar dos células hijas? "); //Mitosis 
        Pregunta pregunta15 = new Pregunta(3,5,"¿Cuántos gramos son 100 mililitros?");//100 gramos
    
        Pregunta pregunta16 = new Pregunta(4,1,"¿Qué distancia hay de la Tierra a la Luna?");//384.400 km
        Pregunta pregunta17 = new Pregunta(4,2,"¿Cómo se llama la unidad de intensidad de la corriente eléctrica?"); //Amperio
        Pregunta pregunta18 = new Pregunta(4,3,"¿Cuál es el nombre de las partículas subatómicas de carga negativa?"); //Electrones
        Pregunta pregunta19 = new Pregunta(4,4,"¿A qué velocidad viaja la luz?");//300.000 Km/s
        Pregunta pregunta20 = new Pregunta(4,5,"¿Un lustro cuantos años son?");//5 años
    
        Pregunta pregunta21 = new Pregunta(5,1,"Quien escribio Ladrón de sábado");//Gabriel Garcia Marquez
        Pregunta pregunta22 = new Pregunta(5,2,"¿Quien es el autor de La intrusa");//Jorge Luis Borges
        Pregunta pregunta23 = new Pregunta(5,3,"¿Quicen escribio El fantasma de Canterville,?");//Oscar Wilde
        Pregunta pregunta24 = new Pregunta(5,4,"¿Cómo murió Vincent Van Gogh?");//suicidio
        Pregunta pregunta25  = new Pregunta(5,5,"¿Quién escribió Historias de cronopios y famas?");//julio Cortazar 
    
        //Le damos los valores a la lista quye almacenara las preguntas que es una lista global en la clase
        listado.add(pregunta1);
        listado.add(pregunta2);
        listado.add(pregunta3);
        listado.add(pregunta4);
        listado.add(pregunta5);
        listado.add(pregunta6);
        listado.add(pregunta7);
        listado.add(pregunta8);
        listado.add(pregunta9);
        listado.add(pregunta10);
        listado.add(pregunta11);
        listado.add(pregunta12);
        listado.add(pregunta13);
        listado.add(pregunta14);
        listado.add(pregunta15);
        listado.add(pregunta16);
        listado.add(pregunta17);
        listado.add(pregunta18);
        listado.add(pregunta19);
        listado.add(pregunta20);
        listado.add(pregunta21);
        listado.add(pregunta22);
        listado.add(pregunta23);
        listado.add(pregunta24);
        listado.add(pregunta25);
    
    }     
    
}
