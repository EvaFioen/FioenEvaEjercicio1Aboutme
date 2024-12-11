package AboutMe;

import java.util.ArrayList;

public class Perfil {
    //ATTRIBUTES
    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    //CONSTRUCTOR VACIO
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

    public String toString() {
        return "Perfil{" +
                "name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", hobbies=" + hobbies +
                ", foods=" + foods +
                ", funFacts=" + funFacts +
                '}';
    }
}
