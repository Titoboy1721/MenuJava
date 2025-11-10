import java.util.Scanner;

public class MenuPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Introducir una palabra");
            System.out.println("2. Verificar si es palíndromo");
            System.out.println("3. Mostrar palabra invertida");
            System.out.println("4. Contar número de caracteres");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
        } while (opcion != 5);
        System.out.println("¡Programa finalizado!");
        sc.close();
    }
}