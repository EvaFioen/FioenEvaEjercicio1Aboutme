package AboutMe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    Perfil miPerfil = new Perfil();

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
        programa.menu();
    }

    public void inicio() {

        miPerfil.setName("Eva Fioen");
        miPerfil.setStory("I don't like this");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Padel");
        miPerfil.setHobbies(hobbies);

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        miPerfil.setFoods(foods);

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("nothing");
        funFacts.add("La verdad no me gusta");
        miPerfil.setFunFacts(funFacts);

        System.out.println(miPerfil);
    }

    public void menu() {
        int menu = 0;
        do {
            // Mostrar el menú
            System.out.println("\nMenu AboutMe [" + miPerfil.getName() + "]");
            System.out.println("1. Ver Story");
            System.out.println("2. Ver Hobbies");
            System.out.println("3. Ver Fun Facts");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Validar la entrada del usuario
            while (!input.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido:");
                input.next(); // Limpiar entrada inválida
            }

            menu = input.nextInt(); // Leer la opción seleccionada
            input.nextLine(); //

            // Procesar la opción seleccionada
            switch (menu) {
                case 1:
                    System.out.println("\nStory: " + miPerfil.getStory());
                    break;
                case 2:
                    System.out.println("\nHobbies: " + miPerfil.getHobbies());
                    break;
                case 3:
                    System.out.println("\nFun Facts: " + miPerfil.getFunFacts());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (menu != 4);
    }
}
