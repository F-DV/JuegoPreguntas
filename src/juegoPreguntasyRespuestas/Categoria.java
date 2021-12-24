package juegoPreguntasyRespuestas;

/**
 *
 * @author FelipeQG
 */
public class Categoria {
    private int categoria;
    private int acomulado;
    private String nombreCategoria;
    
    public Categoria(int acomulado){
        this.acomulado = acomulado;
        elegirCategoria(acomulado);
    }
    
    public void elegirCategoria(int acomulado){
        if(acomulado == 0){
            this.categoria = 1;
            this.nombreCategoria = "Geografia";
            
        }else if(acomulado == 100){
            this.categoria = 2;
            this.nombreCategoria = "Segunda Guerra Mundial";
            
        }else if(acomulado == 300){
            this.categoria = 3;
            this.nombreCategoria = "Ciencia";
            
        }else if(acomulado == 600){
            this.categoria = 4;
            this.nombreCategoria = "Fisica";
            
        }else if(acomulado == 1000){
            this.categoria = 5;
            this.nombreCategoria = "Escritores";
            
        }else{
            this.categoria = 0;
        }            
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getAcomulado() {
        return acomulado;
    }

    public void setAcomulado(int acomulado) {
        this.acomulado = acomulado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
}
