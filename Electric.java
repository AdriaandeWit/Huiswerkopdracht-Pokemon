public class Electric extends SuperPokemon {

    private int volt;
    private  boolean hasATail;
    private  String lightningColor;



    public Electric(String name, int healthPoint, String type, int experience, int level, int volt, boolean hasATail, String lightningColor) {
        super(name, healthPoint, type, experience, level);
        this.volt = volt;
        this.hasATail = hasATail;
        this.lightningColor = lightningColor;

    }
    @Override
    public void scratch(){
        System.out.println(super.getName() + "does not know scratch");
    }

    public void thunderTail(){
        if(hasATail){
            System.out.println(super.getName() + " do thunder Tail");

        }
        else{
            System.out.println(super.getName() + "the pokemon that you chosen has no tail");
        }
    }

    public void thunder(){
        System.out.println(super.getName() + "do thunder!");
    }

    public void thunderWave(){
        System.out.println(super.getName() + "do thunder wave!");
    }

    public void volt(){

        System.out.println(super.getName() + "has a voltage :" + volt + "v" );
    }

    public void lightningColor(){
        System.out.println("the color of  " + getName()+ " is: " + lightningColor );

    }



    //getters
    public int getVolt() {
        return volt;
    }

    public boolean isHasATail() {
        return hasATail;
    }

    public String getLightningColor() {
        return lightningColor;
    }

    //setters
     public void setLightningColor(String lightningColor) {
           this.lightningColor = lightningColor;
        }
    public void setVolt(int volt) {
        this.volt = volt;
    }

    public void setHasATail(boolean hasATail) {
        this.hasATail = hasATail;
    }
}
