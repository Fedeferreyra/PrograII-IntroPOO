import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(null);
        cuentaBancaria.depositar(BigDecimal.valueOf(200L));
        cuentaBancaria.imprimirEstado();
        //sumatoriaDeNumerosHastaIngresoDe0();
        //mayorDe3Numeros();
        //count();
    }

    //Actividad 3
    private static void sumatoriaDeNumerosHastaIngresoDe0() {
        Scanner scanner = new Scanner(System.in);
        int scanned = 1;
        int sumatoria = 0;
        while (scanned != 0){
            System.out.println("Ingrese un numero");
            scanned = scanner.nextInt();
            sumatoria += scanned;
        }
        System.out.println("La sumatoria es: " + sumatoria);
        scanner.close();
    }

    //Actividad 2
    private static void mayorDe3Numeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres numeros");
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int numero = scanner.nextInt();
            if(numero > mayor){
                mayor = numero;
            }
        }

        System.out.println(mayor);
        scanner.close();
    }

    //Actividad 1
    private static void count() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }

}
