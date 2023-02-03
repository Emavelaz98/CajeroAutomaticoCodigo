package principal;

public class ClaseHija_Deposito extends ClasePadre{
    
    @Override
    public void Transacciones(){
        System.out.print("Cuantos deseas Depositar: ");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("----------------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu Salgo Actual es de: " + getSaldo());
        System.out.println("----------------------------------------");
    }
}
