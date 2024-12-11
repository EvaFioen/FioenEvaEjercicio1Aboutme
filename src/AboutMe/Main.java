package AboutMe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio(){
        Perfil miPerfil=new Perfil();

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
}