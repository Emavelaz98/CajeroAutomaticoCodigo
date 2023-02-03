package principal;

public class ClaseHija_Retiro extends ClasePadre{
    
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas Retirar: ");
        Retiro();
        
        //Valido si el cliente tiene saldo o no para retirar efectivo.
        if(retiro >= getSaldo()){
            System.out.println("-----------------------------");
            System.out.println("Dinero Insuficiente.");
            System.out.println("-----------------------------");
        }else{
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu Saldo Actual es de: " + getSaldo());
            System.out.println("------------------------------");
        }
    }
}
