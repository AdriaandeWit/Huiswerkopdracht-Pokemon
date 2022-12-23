public class Electric extends SuperPokemon {

    private int volt;
    private  boolean hasATail;



    public Electric(String name, int healthPoint, String type, int experience, int level, int volt, boolean hasATail) {
        super(name, healthPoint, type, experience, level);
        this.volt = volt;
        this.hasATail = hasATail;

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



    //getters
    public int getVolt() {
        return volt;
    }

    public boolean isHasATail() {
        return hasATail;
    }

    //setters
    public void setVolt(int volt) {
        this.volt = volt;
    }

    public void setHasATail(boolean hasATail) {
        this.hasATail = hasATail;
    }
}
