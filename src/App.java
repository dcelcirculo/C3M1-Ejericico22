import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean play = true;

        do {
            char player1 = verificarLetra(entrada, "Jugador 1. Ingrese P para piedra, L para papel o T para tijera: ");
            char player2 = verificarLetra(entrada, "Jugador 2. Ingrese P para piedra, L para papel o T para tijera: ");
            if (player1 == player2) {
                System.out.println("Empate");
            } else if (player1 == 'P' && player2 == 'T' ||
                    player1 == 'L' && player2 == 'P' ||
                    player1 == 'T' && player2 == 'L') {
                System.out.println("Gana el jugador 1!");
            } else {
                System.out.println("Gana el jugador 2!");
            }

            System.out.print("¿Quiere continuar jugando? (Y/N): ");
            String input = entrada.nextLine().trim();
            play = !input.isEmpty() && Character.toUpperCase(input.charAt(0)) == 'Y';
        } while (play);
        System.out.println("--- Hasta pronto! ---");
        entrada.close();
    }

    public static char verificarLetra(Scanner entrada, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = entrada.nextLine();

            if (!input.isEmpty()) {
                char c = Character.toUpperCase(input.charAt(0));

                if (c == 'P' || c == 'L' || c == 'T') {
                    return c;
                } else {
                    System.out.println("Debe ingresar una de las tres letras del juego: P, L o T");
                }
            } else {
                System.out.println("La entrada no puede estar vacía");
            }
        }
    }
}
