package IntroPOO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        CuentaBancaria cuentaBancaria = new CajaDeAhorro(200, null, null);
        cuentaBancaria.depositar(200L);
        cuentaBancaria.debitar(1000);
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
