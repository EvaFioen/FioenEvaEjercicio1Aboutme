package AboutMe;

import java.util.ArrayList;

public class Perfil {
    //ATTRIBUTES
    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    //CONSTRUCTOR
    public Perfil(){
        this.name="";
        this.story="";
        this.hobbies= new ArrayList<>();
        this.foods= new ArrayList<>();
        this.funFacts=new ArrayList<>();
    }
    //METODOS SETTER
    public void setName(String name) {
        this.name = name;
    }
    public void setStory(String story) {
        this.story = story;

    }
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }
    public void setFunFacts(ArrayList<String> funFacts) {
        this.funFacts = funFacts;
    }

    //METODOS GETTER

    public String getName() {
        return name;
    }
    public String getStory() {
        return story;
    }
    public ArrayList<String> getHobbies() {
        return hobbies;
    }
    public ArrayList<String> getFoods() {
        return foods;
    }
    public ArrayList<String> getFunFacts() {
        return funFacts;
    }

    @Override
    public String toString() {
        return "Perfil de " + name + "\n" +
                "Story: " + story + "\n" +
                "Hobbies: " + hobbies +"\n"+
                "Foods: " + foods + "\n"+
                "Fun Facts:\n" + String.join("\n", funFacts);
    }

    /**
     * Este metodo permite tener cada FunFact en cada linea, es preferenica de vizualizacón.
     * @return Este parametro devuelvo los FunFactos que se añadido al perfil.
     */
    public String getFormattedFunFacts() {
        return "Fun Facts:\n" + String.join("\n", funFacts);
    }
}
