public class Main {
    public static void main(String[] args) {


        Fire charmender = new Fire("Charmender",90,"Fire",25,9,90.5,"Hondenvoer");
        SuperPokemon pikachu = new SuperPokemon("Pikachu ",80,"electric",20,5 );
        Grass sunflora = new Grass("Sunflora", 20,"Grass", 2, 2,2,1);
        Water wartorle = new Water("wartorle",75, "water", 60,20,50,false);
        Electric raichu = new Electric("Raichu",120,"electric",100,90,380,true);
        Electric magnemite = new Electric("Magnemite",25,"electronic", 20,29,12,false);


        charmender.pound();
        pikachu.pound();
        charmender.eat();
        sunflora.woodHammer();
        sunflora.leafStrom();
        wartorle.pound();
        wartorle.hydroCannon();
        raichu.volt();
        magnemite.thunderTail();
        raichu.thunderTail();
        raichu.scratch();
        raichu.thunder();
        raichu.thunderTail();

    }
}
