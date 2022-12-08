
package Aula13;


public class t2 extends Thread {
    filosofo filosofo2 = new filosofo(); //Implementação metodo garfo 2 e 3

        garfo garfo2 = new garfo();
        garfo garfo3 = new garfo();
 
         private int tempo;
        
    public t2(){
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
           if(filosofo2.estado == "pensar" && garfo2.estado == "livre" && garfo3.estado == "livre"){
            filosofo2.comer();
            garfo2.ocupado();
            garfo3.ocupado();
            System.out.println("----- Filosofo 2 esta comendo -----");
            }else if(filosofo2.estado == "comer"){
            filosofo2.pensar();
            garfo2.livre();
            garfo3.livre();
            System.out.println("----- Filosofo 2 esta pensando -----");
            }else if(filosofo2.estado == "pensar"){
            System.out.println("----- Filosofo 2 tentou comer mas nao tem garfo -----");
            }Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    }
    
    
    }
  
    
    
    } 
}
