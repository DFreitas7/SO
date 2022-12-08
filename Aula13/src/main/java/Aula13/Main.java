
package Aula13;


public class Main {

    
    public static void main(String[] args) {
          
       t1 thread1 = new t1();
       t2 thread2 = new t2();
       t3 thread3 = new t3();
       t4 thread4 = new t4();
       t5 thread5 = new t5();
        
            Thread t1= new Thread(thread1);
            Thread t2= new Thread(thread2);
            Thread t3= new Thread(thread3);
            Thread t4= new Thread(thread4);
            Thread t5= new Thread(thread5);
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            
        
        
        }
    }
    

