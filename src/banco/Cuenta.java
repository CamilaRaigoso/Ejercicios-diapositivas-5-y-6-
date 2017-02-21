
package banco;


public class Cuenta {
    private cliente Cliente;
    private String numcuenta;
    private double saldo;
    private double clave;
    
    
    public Cuenta(cliente Cliente, String numcuenta, double saldo, double clave){
        this.Cliente = Cliente;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.clave = clave;
    }
    
    public cliente getcliente (){
        return Cliente;
    }
    public String getnumerocuenta (){
        return numcuenta;
    }
     public double getsaldo (){
         return saldo;
     }
      public double getclave (){
          return clave;
      }
     
     public void consignar (double valor) {
         this.saldo += valor;  
     }
     
     public void retirar (double valorret) {
         this.saldo -= valorret;
     }  
     
     public void nclave (double neuclave ){
         this.clave = neuclave;
     }
     
  
     }
   

