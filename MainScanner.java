import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);

        System.out.println("Ingrese el salario sin ajuste : ");
        float salarioInicial = consola.nextFloat();
        System.out.println("Ingrese el porcentaje de aumento (por ejemplo 0.1 para 10%): ");
        float porcentajeAumentado = consola.nextFloat();
        EjercicioIf pruebaScanner = new EjercicioIf(salarioInicial, porcentajeAumentado, 0);
        float salarioAjustado = pruebaScanner.calcularSalario();
        System.out.println("El salario ajustado es:" +salarioAjustado );
        consola.close();
        
    }
    
}
