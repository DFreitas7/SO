
package Aula09;

import java.util.Random;

/**
 *
 * @author dielson.freitas
 */
public class Main {

  
    public static void main(String[] args) {
        int  linhaA = 10;
        int  linhaB = 100;
        int  coluna = 5;
        
        int[][] tabelaA = new int[linhaA][coluna]; /// tabela para simular memoria ram
        int[][] tabelaB = new int [linhaB][5]; /// tabela b para atualizar A
        
        Random gerador = new Random();
        
        
        /// nome das colunas segue ordem de :
        
        //      /  0 = Numero de paginas (N)  / 1 = instrução (I) / 2 = Dados (D) / 3 =  bit de acesso (R) /  4 = Bit de Modificação (M)
        
        //A coluna N terá os números de 0 a 99, sequencialmente ( linha 0 -> N = 0, linha 1 -> N = 1, linha 2 -> N = 2...)
        int x= 0;
        for(int l= 0 ;  l < linhaB; l++ ){      
       tabelaB[l][0] = x;
       x++;
      
        }
       // A coluna I terá os números de 1 a 100, sequencialmente ( linha 0 -> N = 1, linha 1 -> N = 2, linha 2 -> N = 3...)
        x = 1;
        for(int l= 0 ;  l < linhaB; l++ ){      
       tabelaB[l][1] = x;
       x++;
    
        }
        
     // A coluna D terá números de 1 a 50, sorteados aleatoriamente.           
        for(int l= 0 ;  l < linhaB; l++ ){      
       tabelaB[l][2] = gerador.nextInt(50);
    
        }
 
        
        
        // tabela A 
   
        
        int valor;
        for(int l =0; l < linhaA; l++){    
            valor = gerador.nextInt(100);
        
        for(int c = 0; c < coluna;c++){     
        tabelaA[l][c] = tabelaB[valor][c]; 
     
        }
            
        
        
        }
        
         //processo de execução 
        
     
        int k = 0;
        int processo;
        int caso;
        while(k < 2000){
        
           processo = gerador.nextInt(100);
            
            for(int l=0; l < linhaA; l++){
           
               if( tabelaA[l][1] == processo){
               
                   tabelaA[l][3] = tabelaA[1][3]+1;
                   caso = gerador.nextInt(100);
                   
               if(caso >= 0 && caso <= 30){
                 
                   tabelaA[l][2] = tabelaA[l][2] +1;
                   tabelaA[l][4] = 1;
               }
                   
               }
            }
             for(int l=0; l < linhaA; l++){
               
               if(tabelaA[l][4] == 1){

                    valor = gerador.nextInt(100);      
                    for(int c = 0; c < coluna;c++){   
                        if(tabelaA[l][1] != valor ){
                    tabelaA[l][c] = tabelaB[valor][c]; 
                        }
        }
               
               
               }

               }
            
           k++; 
    }
           // println da tabela A final
            System.out.println("_(N)_(I)_D)_(R)_(M)_" );
        for(int l =0;l < linhaA ; l++){

            System.out.println("_"+tabelaA[l][0]+"_"+tabelaA[l][1]+"_"+tabelaA[l][2]+"_"+tabelaA[l][3]+"_"+tabelaA[l][4]+"_" );

        }
}
    }
    

