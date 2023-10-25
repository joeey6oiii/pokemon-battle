
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();

        CatFerretPokemon zangoose = new CatFerretPokemon("Zangoose", 1);
        LittleBearPokemon teddiursa = new LittleBearPokemon("Teddiursa", 1);
        HibernatorPokemon ursaring = new HibernatorPokemon("Ursaring", 1);
        BalloonPokemon igglybuff = new BalloonPokemon("Igglybuff", 1);
        BalloonPokemon2 jigglypuff = new BalloonPokemon2("Jigglypuff", 1);
        BalloonPokemon3 wigglytuff = new BalloonPokemon3("Wigglytuff", 1);

        battle.addAlly(teddiursa);
        battle.addAlly(ursaring);
        battle.addAlly(zangoose);
        battle.addFoe(igglybuff);
        battle.addFoe(jigglypuff);
        battle.addFoe(wigglytuff);
        
        battle.go();
    }
}