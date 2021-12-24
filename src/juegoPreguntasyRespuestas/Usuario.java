package juegoPreguntasyRespuestas;

/**
 *
 * @author FelipeQG
 */
public class Usuario {
    
    String nombre;
    String apellido;
    int puntos;
    
    public Usuario(String nombre,String apellido,int puntos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntos = puntos;
    }
    public String getDatos(){
        
        return nombre + "," + puntos +";";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
