//Camila Raigoso Raigoso 97022807815
//Ejercicio 3 Dipositivas de la clase 6
package drumkit;

public class DrumKit {
      
    boolean topHat = true;
    boolean snare = true;
    
    void playTopHat (){
        System.out.println("ding dind da-ding");
    }
    
    void playSnare (){
        System.out.println("bang bang ba-bang");
    }
    }
    class DrumKitTestDrive {
        public static void main (String[] args){
        DrumKit d = new DrumKit ();
        d.snare=false;
        d.playTopHat();
        d.playSnare ();
        
        if(d.snare == true){
            d.playSnare();
        }
 
     }
   
    }   
   
    

