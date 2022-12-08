
package Aula13;


public class t3 extends Thread {
    filosofo filosofo3 = new filosofo(); //Implementação metodo garfo 3 e 4

        garfo garfo3 = new garfo();
        garfo garfo4 = new garfo();

    
         private int tempo;
        
    public t3(){
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
    if(filosofo3.estado == "pensar" && garfo3.estado == "livre" && garfo4.estado == "livre"){
            filosofo3.comer();
            garfo3.ocupado();
            garfo4.ocupado();
            System.out.println("----- Filosofo 3 esta comendo -----");
            }else if(filosofo3.estado == "comer"){
            filosofo3.pensar();
            garfo3.livre();
            garfo4.livre();
            System.out.println("----- Filosofo 3 esta pensando -----");
            }else if(filosofo3.estado == "pensar"){
            System.out.println("----- Filosofo 3 tentou comer mas nao tem garfo -----");
            }
    
    Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    }
          
    
    
    }
  
    
    
    } 
}
