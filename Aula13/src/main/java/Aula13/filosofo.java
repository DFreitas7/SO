
package Aula13;


public class filosofo {
    String pensar = "pensar";
    String comer = "comer";
    String estado = "pensar";
    
    
    
    public String pensar(){
     estado = this.pensar;
        return estado;
    }
    
    
    public String comer(){
     estado = this.comer;
        return estado;
    }
    
}
