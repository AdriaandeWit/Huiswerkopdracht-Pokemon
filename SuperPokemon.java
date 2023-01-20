public abstract class SuperPokemon {

    private int healthPoint;
    private String Type;
    private int experience;
    private int Level;
    private String name;

    public SuperPokemon (String name,int healthPoint,String type,int experience, int level){
        this.healthPoint = healthPoint;
        this.Type = type;
        this.experience = experience;
        this.Level = level;
        this.name = name;
    }

    public void pound(){
        System.out.println(getName() + " does pound!");
    }

    public void scratch(){
        System.out.println(getName() + " does Scratch");
    }



// Getters
    public int getHealthPoint() {
        return healthPoint;
    }

    public String getType() {
        return Type;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return Level;
    }

    public String getName(){
        return name;
    }
// Setters
    public void setHealthPoint(int hp) {
     healthPoint = hp;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int lvl) {
        Level = lvl;
    }
    public void setName(){
        this.name = name;
    }
}



