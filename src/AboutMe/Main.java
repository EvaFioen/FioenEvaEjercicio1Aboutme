package AboutMe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    Perfil miPerfil;

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
        programa.menu();
    }

    public void inicio() {
        miPerfil = new Perfil();
        miPerfil.setName("Eva Fioen");
        miPerfil.setStory("Me llamo Eva y soy de Bélgica. Me mudé a Barcelona hace más de 5 años," + "\n"+
                "vivo con mi pareja y nuestros gatos. Este año he empezado a estudiar DAM en La Salle." + "\n"+
                "Mi temporada favorita es el otoño, aunque también me encanta el invierno para poder " + "\n"+
                "estar con todas las mantas posibles.");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Padel 🥎");
        hobbies.add("Caminar por la montaña ⛰️️");
        hobbies.add("Quedar con amigos ☕️🍺🍷");
        miPerfil.setHobbies(hobbies);

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza 🍕");
        foods.add("Curry verde 🍛");
        foods.add("Hamburguesas 🍔");
        foods.add("Tacos 🌮");
        foods.add("Burritos 🌯");
        miPerfil.setFoods(foods);

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("Los actores que ponen voz a Mickey y Minnie se han casado en la vida real.");
        funFacts.add("El logotipo de Chupa Chups fue diseñado por Salvador Dalí.");
        funFacts.add("La Ciudad del Vaticano es el país más pequeño del mundo.");
        funFacts.add("El nombre de Google viene del término 'googol'.");
        funFacts.add("El café puede matar.");
        miPerfil.setFunFacts(funFacts);

        System.out.println(miPerfil);
    }

    public void menu() {
        int menu;
        do {
            // Mostrar el menú
            System.out.println("\nMenu AboutMe [" + miPerfil.getName() + "]");
            System.out.println("1. Ver Story");
            System.out.println("2. Ver Hobbies");
            System.out.println("3. Ver Foods");
            System.out.println("4. Ver Fun Facts");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            while (!input.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido:");
                input.next();
            }
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Story: " + miPerfil.getStory());
                    break;
                case 2:
                    System.out.println("Hobbies: " + miPerfil.getHobbies());
                    break;
                case 3:
                    System.out.println("Foods: " +miPerfil.getFoods());
                    break;
                case 4:
                    System.out.println(miPerfil.getFormattedFunFacts());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (menu != 5);
    }

}
