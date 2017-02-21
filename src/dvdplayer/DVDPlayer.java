//Camila Raigoso Raigoso
//Ejercicio 2 Diapositivas de la clase 6
package dvdplayer;


class DVDPlayer {
    boolean canRecord = false;
    
    void recordDVD (){
        System.out.println("DVD recordin");
        } 
    boolean canPlay = true;
    
    void playDVD (){
        System.out.println("DVD playing");
    }
    }

    class DVDPlayerTestDrive {
    public static void main(String[] args){
     DVDPlayer d= new DVDPlayer ();
     d.canRecord = true;
     d.playDVD ();
     
     if(d.canRecord == true){
         d.recordDVD();
     }
     }
    
}
