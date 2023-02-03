package principal;

import java.util.Scanner;

public abstract class ClasePadre {

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner in = new Scanner(System.in);

    public void Operaciones() {
        int num = 1;
        while (num != 4) {
            System.out.println("Seleccione una Operacion:");
            System.out.println("    1. Consulta de Saldo.");
            System.out.println("    2. Retiro de Efectivo.");
            System.out.println("    3. Deposito de Efectivo.");
            System.out.println("    4. Salir");
            System.out.print("Introduce Operacion: ");
            num = in.nextInt();

            if ((num < 1) || (num > 4)) {
                System.out.println("---------------------------------------------------");
                System.out.println("Opcion no Disponible, Vuelva a intentar Por Favor.");
                System.out.println("---------------------------------------------------");
            }
            
            //Condiciones de las logicas 
            if (num == 1) {
                ClasePadre consultaMsj = new ClaseHija_consultas();
                consultaMsj.Transacciones();
            } else if (num == 2) {
                ClasePadre retiroMsj = new ClaseHija_Retiro();
                retiroMsj.Transacciones();
            } else if (num == 3) {
                ClasePadre depositoMsj = new ClaseHija_Deposito();
                depositoMsj.Transacciones();
            } else if (num == 4) {
                if (num == 4) {
                    System.out.println("--------------------------");
                    System.out.println("Gracias!,vuelva pronto.");
                    System.out.println("--------------------------");
                }
            }

        }
    }
    
    //Metodo para solicitar Deposito
    public void Deposito(){
        deposito = in.nextInt();
    }
    
    //Metodo para solicitar Retiro
    public void Retiro(){
        retiro = in.nextInt();
    }
    
    //Metodo polimorfismo o metodo abstracto
    public abstract void Transacciones();
    
    //Metodo setter y  getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}