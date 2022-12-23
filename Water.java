public class Water extends SuperPokemon {

    private double waterPressure;

    private boolean hasFins;

    public Water(String name, int healthPoint, String type, int experience, int level, double waterPressure, boolean hasFins) {
        super(name, healthPoint, type, experience, level);
        this.waterPressure = waterPressure;
        this.hasFins = hasFins;
    }

    @Override
    public void pound(){

        if(hasFins){
            System.out.println(super.getName() + "has fins, so you can use Waterbeem");
        }
        else {System.out.println(super.getName() + "haven't fins, so it can only tackel");}
    }

    public void hydroCannon(){
        System.out.println(super.getName() + "does hydroCannon ");
    }

    //getters
    public double getWaterPressure() {
        return waterPressure;
    }
    public boolean isHasFins() {
        return hasFins;
    }
    //setters
    public void setWaterPressure(double waterPressure) {
        this.waterPressure = waterPressure;
    }
    public void setHasFins(boolean hasFins) {
        this.hasFins = hasFins;
    }
}
