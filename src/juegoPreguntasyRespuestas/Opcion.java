package juegoPreguntasyRespuestas;

import java.util.ArrayList;

/**
 *
 * @author FelipeQG
 */
public class Opcion {
   private int categoria;
   private String opcion1,opcion2,opcion3,opcion4;
   private int pregunta;
   private int puntos;
   private ArrayList<Opcion> listadoOpciones = new ArrayList<Opcion>();
   
   public Opcion(int categoria,int pregunta,String opcion1,String opcion2,String opcion3,String opcion4){
       this.categoria = categoria;
       this.pregunta = pregunta;
       this.opcion1 = opcion1;
       this.opcion2 = opcion2;
       this.opcion3 = opcion3;
       this.opcion4 = opcion4;
   }
   public Opcion(){
       crearOpciones();
       
   }
   public String dameOpciones(int categoria,int pregunta){
       
       String respuestas = "";
       for(int i=0;i <= listadoOpciones.size();i++){
           
           if(listadoOpciones.get(i).getCategoria() == categoria && listadoOpciones.get(i).getPregunta() == pregunta){
            
               respuestas = listadoOpciones.get(i).getOpcion1() + "\n" + listadoOpciones.get(i).getOpcion2() + "\n" + listadoOpciones.get(i).getOpcion3() + "\n" +
                       listadoOpciones.get(i).getOpcion4();
               break;              
           }
       }
       return respuestas;
   }
   
   public boolean dameRespuestaCorrecta(){
       
       
       
       return false;
   }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
   
   
   
  public void crearOpciones(){
      
    Opcion opcion1 = new Opcion(1,1,"1: 50 estados","2: 48 estados","3. 25 estados","4. 55 estados");//1
    Opcion opcion2 = new Opcion(1,2,"1: Canada","2: Estados unidos","3. Mexico","4. Guatemala");//2
    Opcion opcion3 = new Opcion(1,3,"1: Bolivar","2: Cristobal colon","3. Alvaro Uribe","4. Gabriel Garcia Marquez");//2
    Opcion opcion4 = new Opcion(1,4,"1: Medellin","2: Cali","3. Cundinamarca","4. Bogota");//4
    Opcion opcion5 = new Opcion(1,5,"1: Barcelona","2: Sevilla","3. Bilbao","4. Madrid");//4
      
    Opcion opcion6 = new Opcion(2,1,"1: 1939","2: 1943","3. 1919","4. 1945");//4
    Opcion opcion7 = new Opcion(2,2,"1: Lo asesino rusia","2: lo asesino estados unidos","3. se suicido","4. de viejo");//3
    Opcion opcion8 = new Opcion(2,3,"1: 1932","2: 1945","3. 1939 ","4. 1941");//3
    Opcion opcion9 = new Opcion(2,4,"1: Rusia","2: Polonia","3. Inglaterra","4. Italia");//2
    Opcion opcion10 = new Opcion(2,5,"1: Mustang","2: luff waffe","3. big boy","4. Enola gay ");//4
    
    Opcion opcion11 = new Opcion(3,1,"1: Radioactividad","2: Electrones","3. Electricidad","4. Relatividad");//1
    Opcion opcion12 = new Opcion(3,2,"1: Acido Citrico","2: Acido nitrico","3. Acido desoxirribonucleico ","4. Acido sulfurico");//3
    Opcion opcion13 = new Opcion(3,3,"1: sistema solar ","2: via lactea","3. Alfa centauro ","4. espacio");//2
    Opcion opcion14 = new Opcion(3,4,"1: Mitosis","2: fotosintesis","3. necrosis","4. efectora");//1
    Opcion opcion15 = new Opcion(3,5,"1: 1000 gramos","2: 10 gramos","3. 100 gramos","4. 10000 gramos ");//3
     
    Opcion opcion16 = new Opcion(4,1,"1: 384.400 km","2: 505.401 km","3: 385.233","4: 384.441 km");//1
    Opcion opcion17 = new Opcion(4,2,"1: Amperio","2: resistencia","3: voltaje","4: vatios");//1
    Opcion opcion18 = new Opcion(4,3,"1: Electrones","2: Protones","3: Neutrones ","4: Atomos");//1
    Opcion opcion19 = new Opcion(4,4,"1: 342.000 Km/s","2: 301.000 Km/s","3: 300.052 Km/s","4: 300.000 Km/s");//4
    Opcion opcion20 = new Opcion(4,5,"1: 5.5 años","2: 100 años","3: 1000 años","4: 5 años ");//4
    
    Opcion opcion21 = new Opcion(5,1,"1: Oscar Wilde","2: Jorge Luis Borges","3: Gabriel Garcia Marquez","4: julio Cortazar ");//3
    Opcion opcion22 = new Opcion(5,2,"1: Oscar Wilde","2: Jorge Luis Borges","3: Gabriel Garcia Marquez","4: julio Cortazar ");//2
    Opcion opcion23 = new Opcion(5,3,"1: Oscar Wilde","2: Jorge Luis Borges","3: Gabriel Garcia Marquez","4: julio Cortazar ");//1
    Opcion opcion24 = new Opcion(5,4,"1: 1: asesinado","2: suicidio","3: natural","4: accidente");//2
    Opcion opcion25 = new Opcion(5,5,"1: 1: Oscar Wilde","2: Jorge Luis Borges","3: Gabriel Garcia Marquez","4: julio Cortazar  ");//4
      
    ArrayList<Opcion> opciones = new ArrayList<Opcion>();
    
    listadoOpciones.add(opcion1);
    listadoOpciones.add(opcion2);
    listadoOpciones.add(opcion3);
    listadoOpciones.add(opcion4);
    listadoOpciones.add(opcion5);
    listadoOpciones.add(opcion6);
    listadoOpciones.add(opcion7);
    listadoOpciones.add(opcion8);
    listadoOpciones.add(opcion9);
    listadoOpciones.add(opcion10);
    listadoOpciones.add(opcion11);
    listadoOpciones.add(opcion12);
    listadoOpciones.add(opcion13);
    listadoOpciones.add(opcion14);
    listadoOpciones.add(opcion15);
    listadoOpciones.add(opcion16);
    listadoOpciones.add(opcion16);
    listadoOpciones.add(opcion17);
    listadoOpciones.add(opcion18);
    listadoOpciones.add(opcion19);
    listadoOpciones.add(opcion20);
    listadoOpciones.add(opcion21);   
    listadoOpciones.add(opcion22);
    listadoOpciones.add(opcion23);
    listadoOpciones.add(opcion24);
    listadoOpciones.add(opcion25);
                
  }
}
