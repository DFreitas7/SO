
package Aula04;

import java.util.Random;

/**
 *
 * @author dielson.freitas
 */
public class ciclo {

     private String execuntando = "executando";
    private String bloqueado = " bloqueado"; 
    private String pronto = "pronto";
    
    private int pid[] = {10000,5000,7000,3000,3000,8000,2000,5000,4000,10000};
    private String[] pidEstado = new String[10]; // ESTADO DO PROCESSO EP
    
    private int qt;
   
        Random aleatorio = new Random(); 
    private int[] tp = new int[10]; // TEMPO DE PROCESSAMENTO
    private int[] nes = new int[10];
    private int[] cp = new int[10];
    private int Pid[] = {0,1,2,3,4,5,6,7,8,9};
    
    public void cicloExecutando(){
         
         
                 
         for(int y = 0 ; y < 10 ; y ++){
            int qta= 0; // variavel de controle quantum
            int nal= 0; // variavel de controle aleatorio 
            
            pidEstado[y] = execuntando;
            
            if( pidEstado[y] == execuntando){
                
             for(int x = pid[y]; x >= 0 ; x-- ){
                 
                 tp[y]++;
                 cp[y]= cp[y]+1;
                 nal = aleatorio.nextInt(100)+1; //// gerador de numero aleatorio
                 
                 
                 if(nal >=1 && nal <= 5  ){
                 
                    pidEstado[y] =  bloqueado;
                    
                
               System.out.println("______RESULTADO DE CASA PID______");
               System.out.println("IDENTIFICADOR DE PROCESSO (PID) :" + Pid[y]);
               System.out.println("TEMPO DE PROCESSAMENTO (TP) :" +tp[y]);
               System.out.println("CONTADOR DE PROGRAMA (CP) :"+ cp[y]);
               System.out.println("ESTADO DO PROCESSO (EP) :"+ pidEstado[y]);
               System.out.println("NÚMERO DE VEZES QUE REALIZOU UMA OPERAÇÃO DE E/S (NES) :"+nes[y]);
               System.out.println("numero de quantum : " + qt);
                 
                 
                 cp[y]= cp[y]+1;
                 nes[y]++;
                 }
                 
                 else if(nal >=1 && nal <= 30 && pidEstado[y] == bloqueado ){
                 
                 pidEstado[y] = pronto;
                 
                 x = 0;
                 cp[y]= tp[y]+1;
                 cp[y]= cp[y]+1;                 
                 }
                 
                 
                 qta++;
                 if(qta >= 1000){
                  qt++; 
                  pidEstado[y] = pronto;
                  cp[y]= cp[y]+1;
                 qta = 0;
                 x=0;
                 cp[y]= tp[y]+1;
                 
                 System.out.println("______RESULTADO DE CASA PID______");
             System.out.println("IDENTIFICADOR DE PROCESSO (PID) :" + Pid[y]);
             System.out.println("TEMPO DE PROCESSAMENTO (TP) :" +tp[y]);
             System.out.println("CONTADOR DE PROGRAMA (CP) :"+ cp[y]);
             System.out.println("ESTADO DO PROCESSO (EP) :"+ pidEstado[y]);
             System.out.println("NÚMERO DE VEZES QUE REALIZOU UMA OPERAÇÃO DE E/S (NES) :"+nes[y]);
             System.out.println("numero de quantum : " + qt);
                 
                 }
                 
                 
              
             }
             
             }
             System.out.println("______RESULTADO DE CASA PID______");
             System.out.println("IDENTIFICADOR DE PROCESSO (PID) :" + Pid[y]);
             System.out.println("TEMPO DE PROCESSAMENTO (TP) :" +tp[y]);
             System.out.println("CONTADOR DE PROGRAMA (CP) :"+ cp[y]);
             System.out.println("ESTADO DO PROCESSO (EP) :"+ pidEstado[y]);
             System.out.println("NÚMERO DE VEZES QUE REALIZOU UMA OPERAÇÃO DE E/S (NES) :"+nes[y]);
             System.out.println("numero de quantum : " + qt);
         }

        }

}