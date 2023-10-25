package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.specialAttack.*;
import attacks.statusMove.*;

public class BalloonPokemon extends Pokemon {
    public BalloonPokemon(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setMove(new DreamEater(), new DoubleTeam());
        this.setStats(90, 30, 15, 40, 20, 15);
    }
}
