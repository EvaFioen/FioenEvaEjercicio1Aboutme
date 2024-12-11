import java.util.ArrayList;

public class Perfil {
    //ATTRIBUTES
    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    //CONSTRUCTOR
    public Perfil(String name, String story, ArrayList<String> hobbies,ArrayList<String> foods,ArrayList<String>funFacts){
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
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
}
