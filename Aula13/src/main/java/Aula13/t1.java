
package Aula13;


public class t1 extends Thread{
    filosofo filosofo1 = new filosofo(); //Implementação metodo garfo 1 e 2
        
        garfo garfo1 = new garfo();
        garfo garfo2 = new garfo();       
        private int tempo;
        
    public t1(){
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
       if(filosofo1.estado == "pensar" && garfo1.estado == "livre" && garfo2.estado == "livre"){    
            filosofo1.comer();
            garfo1.ocupado();
            garfo2.ocupado();
            System.out.println("----- Filosofo 1 esta comendo -----");
            }else if(filosofo1.estado == "comer"){
            filosofo1.pensar();
            garfo1.livre();
            garfo2.livre();
            System.out.println("----- Filosofo 1 esta pensando -----");
            }else if(filosofo1.estado == "pensar"){
            System.out.println("----- Filosofo 1 tentou comer mas nao tem garfo -----");
            }
    Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    } 
    }}}

