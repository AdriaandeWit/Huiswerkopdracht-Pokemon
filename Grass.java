public class Grass extends SuperPokemon{


    private int amountOfLeaves;
    private int amountOfFlowers;
    public Grass(String name, int healthPoint, String type, int experience, int level, int amountOfLeaves, int amountOfFlowers) {
        super(name,healthPoint, type, experience, level);
        this.amountOfLeaves = amountOfLeaves;
        this.amountOfFlowers = amountOfFlowers;
    }
    @Override
    public void scratch(){
        System.out.println(super.getName() + "does not know flameThrower");
    }

    public void leafStrom(){
        System.out.println(super.getName() + "Does leafstorm");
    }

    public void woodHammer(){
        System.out.println(super.getName() + "Does woodHammer");
    }

    public void amountofleaves(){
        System.out.println(super.getName()+"has " +  getAmountOfLeaves());
    }



    //Get
    public int getAmountOfLeaves() {
        return amountOfLeaves;
    }
    public int getAmountOfFlowers() {
        return amountOfFlowers;
    }

    //Set
    public void setAmountOfLeaves(int amountOfLeaves) {
        this.amountOfLeaves = amountOfLeaves;
    }

    public void setAmountOfFlowers(int amountOfFlowers) {
        this.amountOfFlowers = amountOfFlowers;
    }
}