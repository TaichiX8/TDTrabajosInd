import java.util.Scanner;

public class CambioMayusculaMinuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String input = scanner.nextLine();

        String resultado = cambiarMayusculaMinuscula(input);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String cambiarMayusculaMinuscula(String cadena) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (Character.isWhitespace(caracter)) {
                continue;
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}