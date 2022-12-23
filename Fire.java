public class Fire extends SuperPokemon{


    private double Temp;
    private String food;


    public Fire( String name, int healthPoint, String type, int experience, int level, double temp, String food) {
        super(name,healthPoint, type, experience, level);
        this.Temp = temp;
        this.food = food;
    }


    @Override
    public void pound(){
        System.out.println(super.getName() + " does not know pound");
    }
    public void flameThrower(){
        System.out.println(super.getName() +  " does flameThrower");
    }
    public void eat(){
        System.out.println(super.getName() +  "Pokemon eats" + food);
    }

    //getters
    public double getTemp() {
        return Temp;
    }

    public String getFood() {
        return food;
    }
    //setters
    public void setTemp(double temp) {
        Temp = temp;
    }


    public void setFood(String food) {
        this.food = food;
    }
}
