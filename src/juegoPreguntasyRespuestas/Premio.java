package juegoPreguntasyRespuestas;
/**
 *
 * @author FelipeQG
 */
public class Premio {
    private int premio;
    private int categoria;
    private int premio1 = 100;
    private int premio2 = 200;
    private int premio3 = 300;
    private int premio4 = 400;
    private int premio5 = 500;

    public int damePremio(int categoria){
        this.categoria = categoria;
        
        switch(categoria){
            case 1:
                premio = premio1;
                break;
            case 2:
                premio = premio2;
                break;
            case 3:
                premio = premio3;
                break;
            case 4:
                premio = premio4;
                break;
            case 5:
                premio = premio5;
                break;
        }
        return premio;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    
    
}

