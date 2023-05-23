 
package camiones;

import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Operaciones {
     private int [][] camiones  = new  int[5][2]; //declaramos arreglo mult
        Scanner entrada  =new Scanner (System.in);
 
 
 public void llenar_Dcamiones(){ 
     int aux=1;
     JOptionPane.showInternalMessageDialog(null," debes ingresar los datos de cada camion"  );
     
  for(int f=0;f<camiones.length;f++){
        
      for(int c=0;c<camiones[f].length;c++)
          
          if(c==0){
               camiones[f][c]= Integer.parseInt(JOptionPane.showInputDialog( "camion"+ aux + "\t ingrese el tamaño del tanque" ));
                 }
          else{ camiones[f][c]= Integer.parseInt(JOptionPane.showInputDialog(  "camion"+aux  + "\t ingrese los litros /100Km" ));}
             aux++;
  }
     
 }   
 public void calcular_recorrido(){
 double trayecto=0;
 int manzanillo =525;
 int veracruz = 668;
 int Monterrey=827;
 
 int opt =Integer.parseInt(JOptionPane.showInputDialog(  "ingrese la opcion a desear\n 1) camion 1\n 2) camion 2\n 3) camion 3\n 4) camion 4\n 5) camion 5"));;
 
 switch(opt){
     case 1:{
         int cont=1;
         trayecto= ((camiones[0][0]*100)/camiones[0][1]);
         System.out.println("el camion "+cont+"\t tiene u nrecorrido de :\t "+trayecto+" por 100 Lt");
           if(trayecto>manzanillo )
           { System.out.println("puede viajar a manzanillo ");}else{ System.out.println("no puede viajar a manzanillo ");}
           if(trayecto>veracruz )
           { System.out.println("puede viajar a veracruz ");}else{ System.out.println("no puede viajar a veracruz ");}
           if(trayecto>Monterrey )
           { System.out.println("puede viajar a monterrey ");}else{ System.out.println("no puede viajar a monterrey ");}
           break;
     }
     case 2:{
      int cont=2;
         trayecto= ((camiones[1][0]*100)/camiones[1][1]);
         System.out.println("el camion "+cont+"\t tiene u nrecorrido de :\t "+trayecto+" por 100 Lt");
           if(trayecto>manzanillo )
           { System.out.println("puede viajar a manzanillo ");}else{ System.out.println("no puede viajar a manzanillo ");}
           if(trayecto>veracruz )
           { System.out.println("puede viajar a veracruz ");}else{ System.out.println("no puede viajar a veracruz ");}
           if(trayecto>Monterrey )
           { System.out.println("puede viajar a monterrey ");}else{ System.out.println("no puede viajar a monterrey ");}
           break;
     }
 }
 }   
 public void imprimir_tabla(){
  for(int f=0;f<camiones.length;f++){
        
      for(int c=0;c<camiones[f].length;c++){
          System.out.print(camiones[f][c]);
      }
        System.out.println("");
          
  }
     
 }   
}
