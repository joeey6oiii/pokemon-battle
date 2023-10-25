package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.specialAttack.*;

public class BalloonPokemon3 extends BalloonPokemon2 {
    public BalloonPokemon3(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.addMove(new Flamethrower());
        this.setStats(140, 70, 45, 85, 50, 45);
    }
}
