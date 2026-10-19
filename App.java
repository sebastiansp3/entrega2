import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("cuantos productos ingresan al lote: ");
        
        int cantidadLote = sc.nextInt();
        double costoTotal = 0;
        int contadorAlta = 0;
        
        for (int i = 1; i <= cantidadLote; i++) {
            sc.nextLine();
            
            System.out.print("ingrese el nombre productos " + i + ": ");
            String nombre = sc.nextLine();
            
            System.out.print("ingrese el costo: ");

            double producto = sc.nextDouble(); 
            
            costoTotal += producto;

            if (producto < 10000) {
                System.out.println("categoria baja");
            } 
            else if (producto >= 10000 && producto <= 50000) { 
                System.out.println("categoria media");
            } 
            else if (producto > 50000) {
                System.out.println("categoria alta");
                contadorAlta++; 
            }
        }
             
        System.out.println("--- REPORTE FINAL ---");
        System.out.println("Costo total del lote: " + costoTotal);
        System.out.println("Cantidad en categoria alta: " + contadorAlta);
        
        sc.close();
    }
}
    