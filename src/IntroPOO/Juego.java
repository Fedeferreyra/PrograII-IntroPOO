package IntroPOO;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) throws Exception {
        int turns = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int value = random.nextInt(100);

        while (turns > 0) {
            System.out.println("Tienes " + turns + " turnos.");
            System.out.println("Ingresa un numero del 0 al 100: ");
            int userValue = scanner.nextInt();
            if (userValue == value) {
                System.out.println("Acertaste!");
                break;
            } else if (userValue > value) {
                System.out.println("El numero ingresado es mayor.");
            } else if (userValue < value) {
                System.out.println("El numero ingresado es menor.");
            }
            turns--;
        }
    }

}
