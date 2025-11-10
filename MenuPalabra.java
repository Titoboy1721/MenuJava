import java.util.Scanner;

public class MenuPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String palabra = "";
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Introducir una palabra");
            System.out.println("2. Verificar si es palíndromo");
            System.out.println("3. Mostrar palabra invertida");
            System.out.println("4. Contar número de caracteres");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.print("Introduce una palabra: ");
                    palabra = sc.nextLine();
                    break;
                case 2:
                    String invertida = new StringBuilder(palabra).reverse().toString();
                    if (palabra.equalsIgnoreCase(invertida)) {
                        System.out.println("La palabra es un palíndromo.");
                    } else {
                        System.out.println("La palabra no es un palíndromo.");
                    }
                    break;
                case 3:
                    if (palabra.isEmpty()) {
                        System.out.println("Primero debes introducir una palabra.");
                    } else {
                        System.out.println("Palabra invertida: " + new StringBuilder(palabra).reverse());
                    }
                    break;
                case 4:
                    if (palabra.isEmpty()) {
                        System.out.println("Primero debes introducir una palabra.");
                    } else {
                        System.out.println("Número de caracteres: " + palabra.length());
                    }
                    break;
            }
        } while (opcion != 5);
        System.out.println("¡Programa finalizado!");
        sc.close();
    }
}