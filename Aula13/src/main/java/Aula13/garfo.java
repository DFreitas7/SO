
package Aula13;


public class garfo {
   String estado = "livre";
    String ocupado = "ocupado";
    String livre = "livre";
    
     public String ocupado(){
     estado = this.ocupado;
        return estado;
    }
    
    
    public String livre(){
     estado = this.livre;
        return estado;
    } 
}
