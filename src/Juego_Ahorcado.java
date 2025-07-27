import java.util.Scanner;

public class Juego_Ahorcado {
    public static void main(String[] args) throws Exception {
        //Vamos hacer el juego del ahorcado

        //clase para que el usuario pueda escribir por medio de teclado
        Scanner entrada = new Scanner(System.in);

        //Declaracion de las variables
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char [] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control de tipo iterativa
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {

<<<<<<< HEAD
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + "letras");
=======
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");
>>>>>>> 88b2006 (Arreglo del readme)
            System.out.println("Introduce una letra por favor");

            char letra = Character.toLowerCase(entrada.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
<<<<<<< HEAD
                System.out.println("Letra incorrecta, te quedan: " + (intentosMaximos - intentos) + "intentos.");
=======
                System.out.println("Letra incorrecta, te quedan: " + (intentosMaximos - intentos) + " intentos.");
>>>>>>> 88b2006 (Arreglo del readme)
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
<<<<<<< HEAD
                System.out.println("Felicidades, has adivinado la palabra secreta" + palabraSecreta);
=======
                System.out.println("Felicidades, has adivinado la palabra secreta " + palabraSecreta);
>>>>>>> 88b2006 (Arreglo del readme)
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Que pena, te has quedado sin intentos");
        }

        entrada.close();
    }
}
