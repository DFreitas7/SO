
package Aula13;


public class t5 extends Thread{
     filosofo filosofo5 = new filosofo();  //Implementação metodo garfo 1 e 5        
        garfo garfo1 = new garfo();
        garfo garfo5 = new garfo();
     private int tempo;
        
    public t5(){
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
             if(filosofo5.estado == "pensar" && garfo1.estado == "livre" && garfo5.estado == "livre"){
            filosofo5.comer();
            garfo5.ocupado();
            garfo1.ocupado();
            System.out.println("----- Filosofo 5 esta comendo -----");
            }else if(filosofo5.estado == "comer"){
            filosofo5.pensar();
            garfo5.livre();
            garfo1.livre();
            System.out.println("----- Filosofo 5 esta pensando -----");
            }else if(filosofo5.estado == "pensar"){
            System.out.println("----- Filosofo 5 tentou comer mas nao tem garfo -----");
            }
             
             Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    }
            
    
    
    }
  
    
    
    }
}
