
package practical_3;

class ExcessBillException extends Exception {
    public ExcessBillException(String message){
        super(message);
    }
   }
public class Practical_3{
    
    static void checkBill(double amount) throws
ExcessBillException {
        if (amount > 5000) {
            throw new ExcessBillException("Electricity bill exceeds the permited limit");
        }
        System.out.println("Bill Amount:" +amount);
    }        
  
    public static void main(String[] args) {
        try {
            checkBill(6500);
        } catch (ExcessBillException e) {
            System.out.println("Exception: "+
                    e.getMessage());
        }
       
    }
    
}
