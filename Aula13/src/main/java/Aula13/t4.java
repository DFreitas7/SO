
package Aula13;


public class t4 extends Thread {
    filosofo filosofo4 = new filosofo(); //Implementação metodo garfo 4 e 5
        garfo garfo4 = new garfo();
        garfo garfo5 = new garfo();
     private int tempo;
        
    public t4(){
    this.tempo = tempo;
    Thread t = new Thread(this);
    t.start();
    }
    
    
    @Override
    public void run(){
    
     int x = 500;
    while(x > 0){
    x--;
    try{
        if(filosofo4.estado == "pensar" && garfo4.estado == "livre" && garfo5.estado == "livre"){
            filosofo4.comer();
            garfo4.ocupado();
            garfo5.ocupado();
            System.out.println("----- Filosofo 4 esta comendo -----");
            }else if(filosofo4.estado == "comer"){
            filosofo4.pensar();
           garfo4.livre();
            garfo5.livre();
            System.out.println("----- Filosofo 4 esta pensando -----");
            }else if(filosofo4.estado == "pensar"){
            System.out.println("----- Filosofo 4 tentou comer mas nao tem garfo -----");
            }Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    }  
    
    
    }
  
    
    
    }
}
