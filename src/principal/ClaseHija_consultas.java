package principal;

public class ClaseHija_consultas extends ClasePadre{
    
    @Override
    public void Transacciones(){
        System.out.println("----------------------------------------");
        System.out.println("Tu Saldo Actual es de: " + getSaldo());
        System.out.println("----------------------------------------");
    }
}
