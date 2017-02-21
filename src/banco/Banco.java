
package banco;

public class Banco {

  
    public static void main(String[] args) {
        cliente c1 = new cliente("Magdalena Sánchez");
        cliente c2 = new cliente ("Joselito Pérez");
        Cuenta cu1 = new Cuenta(c1,"1012",0,1234 );
        Cuenta cu2 = new Cuenta (c2,"1013",500000,9876);
      
        System.out.println("DATOS INICIALES\n");
        System.out.println("Informacion del cliente\nNombre:"+ cu1.getcliente().getnombre() + "\nSu numero de cuenta es:" +cu1.getnumerocuenta()+ "\nSu clave es:" + cu1.getclave()+  "\nSu saldo es:"+ cu1.getsaldo()+"\n" );
        System.out.println("Informacion del cliente\nNombre:"+ cu2.getcliente().getnombre() + "\nSu numero de cuenta es:" +cu2.getnumerocuenta() + "\nSu clave es:" + cu2.getclave()+ "\nSu saldo es:"+ cu2.getsaldo()+"\n" );
        
        
        cu1.consignar(100000);
        cu2.nclave(4321);
        
        System.out.println("DATOS FINALES \n");
        System.out.println("Nombre:"+ cu1.getcliente().getnombre());
        System.out.println("Su nuevo saldo es:" + cu1.getsaldo()+"$\n" );
        System.out.println("Nombre:"+ cu2.getcliente().getnombre());
        System.out.println("Su nueva clave:"+cu2.getclave());
        System.out.println("Su saldo es:" + cu2.getsaldo()+"$\n" );
        
        
    }
    
}
