package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.statusMove.*;

public class BalloonPokemon2 extends BalloonPokemon {
    public BalloonPokemon2(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.addMove(new PlayNice());
        this.setStats(115, 45, 20, 45, 25, 20);
    }
}
